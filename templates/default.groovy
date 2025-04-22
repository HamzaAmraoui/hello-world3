pipeline {
  application_type = "java" // o "nodejs" si estás en frontend

  stages {
    Checkout
    Build
    Deploy
  }
}
