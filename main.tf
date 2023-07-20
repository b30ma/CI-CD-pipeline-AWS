provider "aws" {
  region = "us-west-2"
}

resource "aws_instance" "example" {
  ami           = < "ami-..."> 
  instance_type = "t2.micro"
}

// variables.tf

variable "access_key" {}
variable "secret_key" {}

// terraform.tfvars

access_key = "YOUR_ACCESS_KEY"
secret_key = "YOUR_SECRET_KEY"
