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

    post {
        always {
            junit '**/target/*.xml'
        }
        failure {
            mail bcc: '', body: 'Shit happens', cc: '', from: 'Jenkins', replyTo: '', subject: 'Jenkins error', to: 'morozovjavadeveloper@gmail.com'
        }
    }
}
