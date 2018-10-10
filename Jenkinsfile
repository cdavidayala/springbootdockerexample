node {

       stage('Clone Repository') {
            // Get some code from a GitHub repository
            git 'https://github.com/cmduquer/springbootdockerexample.git'
        
       }
       
       stage('Build') { 
          
            sh 'mvn clean install'
            
          
        }
        
        stage('Image') {

                sh 'docker build -t springbootdockerexample .'
                sh 'docker tag springbootdockerexample cmduquer/springbootdockerexample:latest'
                sh 'docker image ls'

        }
        
        stage('Docker Push') {
	        withCredentials([usernamePassword(credentialsId: 'dockerHub', passwordVariable: 'dockerHubPassword', usernameVariable: 'dockerHubUser')]) {
	          sh "docker login -u ${env.dockerHubUser} -p ${env.dockerHubPassword}"
	          sh 'docker push springbootdockerexample cmduquer/springbootdockerexample:latest'
	        }
      
    	}

  
}