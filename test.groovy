def res = sh(script: "curl --request GET --url https://api.cloudflare.com/client/v4/ips --header 'Authorization: Bearer undefined' --header 'Content-Type: application/json'", returnStdout: true)
println(res)