node{
    checkout scm
    stage('Mvn package'){
        def mvnHome= tool name: 'maven', type: 'maven'
        def mvnCMD= "${mvnHome}/bin/mvn"
        sh "${mvnCMD} clean package"
    }

   
}
