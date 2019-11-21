node{
    checkout scm
    stage('Mvn package'){
        def mvnHome= tool name: 'Maven', type: 'maven'
        def mvnCMD= "${mvnHome}/bin/mvn"
        sh "${mvnCMD} clean package"
    }



    stage('Push image'){
       sh "set PATH='/usr/local/bin/docker'"
        docker.withRegistry('https://registry.hub.docker.com','Dockerhub'){
             def app= docker.build("rajeshpodder007/dockerk8s:${env.BUILD_NUMBER}")
            app.push()
        }
    }
}