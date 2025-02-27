pipeline {
    agent any
    stages {
        tools {
            maven 'Maven 3.3.9'
            jdk 'jdk8'
        }
        stage('Checkout') {
            steps {
                git branch:'Runzhou_Zhu_week6_inclass_assignment', url:'https://github.com/RunzhouZHu/jenkins-repo.git'
            }
        }
        stage('Build') {
            steps {
                bat 'mvn clean install'
            }
        }
        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }
    }
}