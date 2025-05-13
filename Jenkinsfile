pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                sh 'javac -cp .:/usr/share/java/junit4.jar HelloWorld.java HelloWorldTest.java'
            }
        }
        stage('Test') {
            steps {
                sh 'java -cp .:/usr/share/java/junit4.jar org.junit.runner.JUnitCore HelloWorldTest'
            }
        }
        stage('Deploy') {
            steps {
                sh 'echo "Deploy simulado concluído"'
            }
        }
    }
}
