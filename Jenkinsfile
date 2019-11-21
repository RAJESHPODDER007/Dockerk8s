node{

    checkout scm
    def app
    
    stage('Mvn package'){
        def mvnHome= tool name: 'Maven', type: 'maven'
        def mvnCMD= "${mvnHome}/bin/mvn"
        sh "${mvnCMD} clean package"
    }

    stage('Push image'){
        docker.withRegistry('https://registry.hub.docker.com','Dockerhub'){
                 app= docker.build("rajeshpodder007/dockerk8s:${env.BUILD_NUMBER}")
            app.push()
        }
    }
}