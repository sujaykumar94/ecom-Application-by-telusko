# ecom-Application-by-telusko
ecom-Application-by-telusko, https://www.youtube.com/watch?v=_49KFUV7TVY



Redis Cache
--Check WSL status
- wsl --status

--Command to run the redis on local docker 
- docker run --name redis-cache -d -p 6379:6379 redis


-- Pushing docker image from local to docker hub 
https://chatgpt.com/s/p_6a591716937c81918168a21cfac5e7cb 
- docker iamges   --to check the docker images in local 
- docker login   --login to docker hub  
- docker tag redis:latest sujaykumar887/redis-demo:latest        --add the tag  
- docker images      --verify the image is created
- docker push sujaykumar887/redis-demo:latest          --push the image to docker repo
- 

--To verify the values stored in redis cache, run below commands inside redis container
- which redis-cli
-  KEYS *          --displays all the keys/caches
- GET productsCache::9      --To view the values in the key 9. Example: The product with id=9



