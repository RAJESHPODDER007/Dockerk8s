node{
    def app
    
    stage('Mvn package'){
        def mvnHome= tool name: 'Maven', type: 'maven'
        def mvnCMD= "${mvnHome}/bin/mvn"
        sh "${mvnCMD} clean package"
    }
    stage('Docker image build'){
          app= docker.build("rajeshpodder007/dockerk8s:${env.BUILD_NUMBER}")
    }
    stage('Push image'){
        docker.withRegistry('https://registry.hub.docker.com','Dockerhub'){
            app.push()
        }
    }
}