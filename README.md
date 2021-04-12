# UserAccount Project

CI pipeline 
  ->checks out to current repo
  ->sets up JDK 8
  ->sets up gradle and build projects and runs tests with it
  ->build docker image(via dockerfile) and pushes it to dockerhub
  
Test Approach
  My test approach was first i checked if the apis are working with MockMvc and automation tests(with rest assured), and also if the functionality was working(creating, deleting etc)

  
