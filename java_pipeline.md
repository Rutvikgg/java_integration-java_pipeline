# In Pipline -> Defination - Select Pipeline script and put the following script
    pipeline {
        agent any
    
        stages {
            stage('Checkout') {
                steps {
                    git branch: 'main', url: 'https://github.com/Rutvikgg/java_integration-java_pipeline.git'
                }
            }
    
            stage('Build') {
                steps {
                    // Compile the Java code using Windows batch command
                    bat 'javac DemoProgram.java'
                }
            }
    
            stage('Test and Run') {
                steps {
                    // Run your Java program using Windows batch command
                    bat 'java DemoProgram'
                }
            }
        }
    
        post {
            success {
                echo 'Pipeline succeeded!'
            }
            failure {
                echo 'Pipeline failed!'
            }
        }
    }
