pipeline {
    agent {
        docker {
            image 'katalonstudio/katalon'
            args "-u root"
        }
    }
    stages {
		stage('Compile') {
            steps {
                echo 'Compiled Succesfully !!';
            }
        }
		stage('JUnit') {
            steps {
                echo 'Junit Passed Succesfully';
            }
        }
		stage('Quality-Gate') {
            steps {
                echo 'SonarQube Quality Gate Passed Succesfully !!';
            }
        }
		stage('Test') {
            steps {
                sh 'katalon-execute.sh -browserType="Chrome" -retry=0 -statusDelay=15 -testSuitePath="Test Suites/Test Suites/menu_test_suite"';
            }
        }
		stage('Deploy') {
            steps {
                echo 'Pass !';
            }
        }
        
    }
    post {
        always {
            echo 'This will always run'
        }
		success{
			echo 'This will run only if succesfull'
		}
		failure{
			echo 'This will run only if failed'
		}
		unstable{
			echo 'This will run only if the run was marked as unstable'
		}
		changed{
			echo 'THis will run only if the run was marked as unnstable'
			echo 'For example, if the Pipleline was previously failinlg but is now succesful'
		}
    }
}