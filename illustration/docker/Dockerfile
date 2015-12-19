FROM debian
MAINTAINER Rémi LEBLOND <remi.leblond@laposte.net>
RUN apt-get update
RUN apt-get -y install nginx
RUN apt-get -y install vim
ADD index.html /var/www/html/
ADD script.sh /root/
RUN chmod +x /root/script.sh
EXPOSE 80
CMD ["/root/script.sh"]
