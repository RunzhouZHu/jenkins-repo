pipeline {
    agent any
    tools {
        maven 'Maven3'
        jdk 'java_Home'
    }
    stages {
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