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
            mail to: 'morozovjavadeveloper@gmail.com', subject: 'pipeline failed :('
        }
    }
}
