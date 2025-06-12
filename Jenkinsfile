pipeline {
    agent { label 'slave1' }  // Use the label of your agent
    stages {
        stage('Checkout') {
            steps {
                echo 'Checking out code...'
                scm checkout
            }
        }
        stage('Build') {
            steps {
                sh 'mvn clean compile'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
    }
}
