package com.caltamirano

class DockerUtil implements Serializable {
    
    def steps
    
    DockerUtil(steps){
        this.steps = steps
    }

    def build(){
        steps.sh "docker build ."
    }
}
