@echo on
docker stop postgres
docker rm postgres
docker stop discord_leo_bot
docker rm discord_leo_bot
docker-compose up -d