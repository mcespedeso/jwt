# json web token

JWT Authentication Tutorial: An example using Spring Boot

# get access token by POST

curl -X POST -H "X-Requested-With: XMLHttpRequest" -H "Content-Type: application/json" -H "Cache-Control: no-cache" -d '{  
    "username": "mcespedeso@gmail.com",
    "password": "123456"
}' "http://localhost:8080/api/auth/login"

### response

{
    "token": "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJtY2VzcGVkZXNvQGdtYWlsLmNvbSIsInNjb3BlcyI6WyJST0xFX0FETUlOIiwiUk9MRV9QUkVNSVVNX01FTUJFUiJdLCJpc3MiOiJodHRwOi8vd3d3LmlkZWFzd2ViLmNvbS5weSIsImlhdCI6MTUwMTIxNDk0NywiZXhwIjoxNTAxMjE1ODQ3fQ.wJ0mzrsWYshjnzWylb3eO5Jv3dD-v_5BUh0ERTOMtzRqOgFzJF8kgrbuUh7OZlGM88ZYpSs50inUq4hY58wWhw",
    "refreshToken": "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJtY2VzcGVkZXNvQGdtYWlsLmNvbSIsInNjb3BlcyI6WyJST0xFX1JFRlJFU0hfVE9LRU4iXSwiaXNzIjoiaHR0cDovL3d3dy5pZGVhc3dlYi5jb20ucHkiLCJqdGkiOiIzOTg1MGRhZC03NTcyLTQ2N2MtOGNlMC0yYTcxNTcwM2ExYzIiLCJpYXQiOjE1MDEyMTQ5NDcsImV4cCI6MTUwMTIxODU0N30.abSdV5S3vCKC1eJgHk7PGmk17qvXhWwPNST7wL3R7Hbgn0_3teUbnUtc1xD_7NB0A5am4VuLn56gCIgNB76TVQ"
}

# refresh access token

curl -X GET -H "X-Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJtY2VzcGVkZXNvQGdtYWlsLmNvbSIsInNjb3BlcyI6WyJST0xFX1JFRlJFU0hfVE9LRU4iXSwiaXNzIjoiaHR0cDovL3d3dy5pZGVhc3dlYi5jb20ucHkiLCJqdGkiOiIzOTg1MGRhZC03NTcyLTQ2N2MtOGNlMC0yYTcxNTcwM2ExYzIiLCJpYXQiOjE1MDEyMTQ5NDcsImV4cCI6MTUwMTIxODU0N30.abSdV5S3vCKC1eJgHk7PGmk17qvXhWwPNST7wL3R7Hbgn0_3teUbnUtc1xD_7NB0A5am4VuLn56gCIgNB76TVQ" -H "Cache-Control: no-cache" "http://localhost:8080/api/auth/token/"

### response

{"token":"eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJtY2VzcGVkZXNvQGdtYWlsLmNvbSIsInNjb3BlcyI6WyJST0xFX0FETUlOIiwiUk9MRV9QUkVNSVVNX01FTUJFUiJdLCJpc3MiOiJodHRwOi8vd3d3LmlkZWFzd2ViLmNvbS5weSIsImlhdCI6MTUwMTIxNTExNywiZXhwIjoxNTAxMjE2MDE3fQ.VdL8ICPHsuZWXVRs0W667ZmxXVDW3V6IpMPV_6QR_uFdXFy23EoZnKxRcI5kuOYvrmqegJKxsvqW168ynwgCMA"}