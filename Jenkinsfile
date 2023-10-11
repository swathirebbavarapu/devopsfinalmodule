pipeline{
  agent any
    stages{
      stage('Deploy'){
        steps{
          echo "Test successful"
          bat "mvn compile"
        }
      }
      stage('Build'){
        steps{
          echo "Build successful"
          bat "mvn clean"
        }
      }
      stage('Test'){
        steps{
          echo "Test successful"
          bat "mvn test"
        }
      }
    }
}
      
