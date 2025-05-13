pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                sh 'javac HelloWorld.java'
            }
        }
        stage('Test') {
            steps {
                sh 'echo "Simulando testes unitários"'
            }
        }
        stage('Deploy') {
            steps {
                sh 'echo "Deploy simulado concluído"'
            }
        }
    }
}
