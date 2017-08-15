FROM ubuntu

MAINTAINER Newton Beck

RUN apt-get update

RUN apt-get install ruby -y && gem install sinatra

RUN mkdir /home/root

COPY hello.rb /home/root/hello.rb

CMD ruby /home/root/hello.rb -o 0.0.0.0

