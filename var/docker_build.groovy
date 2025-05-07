def call (string ProjectName, string ImageTag, String dockerHubUser) {
   sh "docker build -t   "${dockerHubUser}"/"${ProjectName}":"${ImageTag}"  ."
}
