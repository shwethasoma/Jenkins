job('First-Maven-Project-via-dsl')
{
    description("First maven job generated by the dsl on ${new Date()},the project is a small Maven project")
}
scm
{
  git("git@github.com:shwethasoma/Jenkins.git",master)
}
triggers
{
  scm('* * * * *')
}
steps
{
  maven('clean package','Sample Maven Project/java-maven-junit-helloworld-master/pom.xml')
}
publishers
{
  archiveArtifacts '**/*.jar'
}
