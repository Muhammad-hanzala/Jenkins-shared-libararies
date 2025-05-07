def call (string ProjectName, string ImageTag, String DockeHubUser) {
   sh "docker build -t   "${DockerHubUser}"/"${ProjectName}":"${ImageTag}"  ."
}
