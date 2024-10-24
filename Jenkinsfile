pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building...'
                sh 'mvn clean compile'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing...'
                sh 'mvn test'
            }
        }
    }

    post
        always {
            junit '**/target/*.xml'
        }
        failure {
            emailext body: 'Shit happens', subject: 'Jenkins fail', to: 'morozovjavadeveloper@gmail.com'
        }
    }
}
