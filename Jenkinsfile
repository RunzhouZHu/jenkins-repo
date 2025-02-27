pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                git branch:'Runzhou_Zhu_week6_inclass_assignment', url:'https://github.com/RunzhouZHu/jenkins-repo.git'
            }
        }
        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
    }
}
