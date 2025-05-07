def call () {
  
}


echo "Pushing the image to Docker Hub..."
                withCredentials([usernamePassword(
                    credentialsId: 'dockerhubcred',
                    passwordVariable: 'dockerHubPass',
                    usernameVariable: 'dockerHubUser'
                )]) {
                    sh "docker login -u $dockerHubUser -p $dockerHubPass"
                    sh "docker tag notes-app:latest $dockerHubUser/notes-app:latest"
                    sh "docker push $dockerHubUser/notes-app:latest"
