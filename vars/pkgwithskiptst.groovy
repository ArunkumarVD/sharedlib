def call(){
    stage('Maven Package')
      //define maven command to be executed
    def mavenCommand = 'mvn package -DskipTests=true'

    //Execute the maven command in a shell
    sh script: mavenCommand, returnStatus: true
}
}
