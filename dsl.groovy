def giturl = 'https://github.com/mimin0/simple-java-maven-app'

job('DSL-SimpleJava-Test') {
    scm {
        git(giturl)
    }
    triggers {
        scm('H/15 * * * *')
    }
    steps {
        maven('-e clean verify deploy')
    }
}