
10/Dans notre code,logging.level.root=WARN indique que le niveau de journalisation pour la racine est configuré sur WARN.
Cela signifie que seuls les messages de niveau WARN ou supérieur seront enregistrés. 
Les messages de niveau DEBUG et INFO seront ignorés, mais les messages de niveau WARN, ERROR,
et les niveaux supérieurs seront enregistrés dans les journaux.
Cela permet de contrôler la quantité d'informations enregistrées dans les journaux, 
ce qui peut être utile pour filtrer le bruit et se concentrer sur les informations les plus importantes ou les problèmes critiques.
//
11/
*/Pour configurer une application Spring Boot afin qu'elle écrive les messages de journalisation 
dans un fichier nommé "mylog.log" à l'intérieur du répertoire "logs" dans le dossier de l'application, vous pouvez suivre ces étapes :
*/Créer le dossier "logs" : Assurez-vous d'avoir un dossier "logs" à la racine de votre projet Spring Boot. Si ce dossier n'existe pas,
 vous pouvez le créer manuellement.
Configurer la journalisation dans Spring Boot : Vous pouvez configurer la journalisation dans Spring Boot 
en utilisant le fichier application.properties ou application.yml.Dans votre fichier application.properties, vous pouvez ajouter les lignes suivantes :
bash.

*/Copy code
{logging.file.name=logs/mylog.log}


==>Cette configuration spécifie que les messages de journalisation doivent être écrits dans un fichier nommé "mylog.log" à l'intérieur du répertoire "logs".
Redémarrer l'application : Après avoir effectué cette configuration, redémarrez votre application Spring Boot.
Vérifier les messages de journalisation : Une fois l'application redémarrée, vous devriez voir les messages
 de journalisation écrits dans le fichier "mylog.log" situé dans le dossier "logs".
 Vous pouvez ouvrir ce fichier pour vérifier si les messages sont correctement enregistrés.
/***************************************************************************************************************************************************************************************************************************************************************************/
Voici le rôle de chaque ligne dans votre configuration Spring Boot :
1/spring.application.name=logging : Définit le nom de l'application Spring Boot comme "logging".
2/logging.file.name=logs/mylog.log : Configure le fichier de journalisation pour l'application.
 Les journaux seront écrits dans le fichier "mylog.log" situé dans le répertoire "logs".
3/logging.level.root=error : Définit le niveau de journalisation pour la racine du journal.
 Seuls les messages d'erreur ou de niveau supérieur seront enregistrés dans les journaux.
4/logging.pattern.console=%d{yyyy-MM-dd HH:mm:ss}%-5level---[%thread]%logger{20}-%msg%n : Configure le modèle de mise en forme des messages 
de journalisation qui seront affichés sur la console. Le modèle comprend la date, le niveau de journalisation,
 le thread, le nom du logger, le message et un caractère de nouvelle ligne.
5/logging.pattern.file=%d{yyyy-MM-dd }%-5level ---[%thread]%logger{100}-%msg%n : Configure le modèle de mise en forme des messages de journalisation
 qui seront enregistrés dans le fichier de journalisation. Le modèle comprend la date, le niveau de journalisation, le thread, 
le nom du logger, le message et un caractère de nouvelle ligne.
6/server.port=8080 : Configure le port sur lequel le serveur web de Spring Boot écoutera les requêtes HTTP.
 Dans ce cas, le serveur écoutera sur le port 8080.
7/spring.application.description=YourAppDescription : Définit la description de l'application Spring Boot.
8/spring.application.version=1.0.0 : Définit la version de l'application Spring Boot.
Ces lignes de configuration sont utilisées pour personnaliser différents aspects de votre application Spring Boot,
 tels que la gestion des journaux, le nom et la description de l'application, ainsi que le port sur lequel le serveur web écoute les requêtes.

/****************************************************************************************************************************************************************************************************************************************************************************/
Ces directives de configuration définissent le niveau de journalisation pour la catégorie racine du journal (root).
 Voici la différence entre chaque niveau de journalisation :

1/logging.level.root=error : Ce niveau de journalisation signifie que seuls les messages d'erreur seront enregistrés.
 Les messages de niveau ERROR, WARN, INFO, DEBUG et TRACE ne seront pas enregistrés dans les journaux.
2/logging.level.root=warn : Ce niveau de journalisation signifie que les messages d'erreur et les avertissements seront enregistrés.
 Les messages de niveau ERROR et WARN seront enregistrés, mais les messages de niveau INFO, DEBUG et TRACE ne le seront pas.
3/logging.level.root=info : Ce niveau de journalisation signifie que les messages d'erreur, les avertissements et les informations seront enregistrés.
 Les messages de niveau ERROR, WARN et INFO seront enregistrés, mais les messages de niveau DEBUG et TRACE ne le seront pas.
4/logging.level.root=debug : Ce niveau de journalisation signifie que les messages d'erreur, les avertissements,
 les informations et les messages de débogage seront enregistrés.
 Les messages de niveau ERROR, WARN, INFO et DEBUG seront enregistrés, mais les messages de niveau TRACE ne le seront pas.
5/logging.level.root=trace : Ce niveau de journalisation signifie que tous les messages seront enregistrés,
 y compris les messages de suivi détaillés. Les messages de niveau ERROR, WARN, INFO, DEBUG et TRACE seront tous enregistrés.
==> En résumé, la différence réside dans le niveau de détail des messages enregistrés,
 allant de l'enregistrement seulement des erreurs critiques à l'enregistrement de tous les messages, y compris les détails de suivi les plus fins. 
Le choix du niveau de journalisation dépend généralement du niveau de détail requis pour le débogage et du volume de messages que vous souhaitez voir dans vos journaux.
/****************************************************************************************************************************************************************************************************************************************************************************/
c'est quoi endpoint et c'est quoi leur role 

1/Un endpoint, dans le contexte des applications web, est une URL spécifique qui représente une ressource ou une fonctionnalité spécifique d'une application.
 Les endpoints sont utilisés pour définir des points d'entrée dans une application web, où les clients peuvent interagir avec le système en envoyant
 des requêtes HTTP (par exemple, GET, POST, PUT, DELETE) pour effectuer des opérations spécifiques.

2/Le rôle des endpoints dans une application web est de fournir une interface pour accéder et manipuler les données ou les fonctionnalités de l'application. 
Voici quelques-uns de leurs rôles principaux :

*/Accès aux données : Les endpoints permettent aux clients d'accéder et de manipuler les données stockées dans l'application. 
   Par exemple, un endpoint peut être utilisé pour récupérer des données à afficher dans une interface utilisateur 
   ou pour soumettre des données à enregistrer dans une base de données.
*/Exécution d'actions : Les endpoints peuvent être utilisés pour déclencher des actions spécifiques dans l'application. 
  Par exemple, un endpoint peut être utilisé pour effectuer une opération de traitement sur les données, envoyer des e-mails, générer des rapports, etc.
*/Intégration avec d'autres systèmes : Les endpoints sont souvent utilisés pour permettre l'intégration avec d'autres systèmes ou services. 
  Par exemple, un endpoint peut être utilisé pour communiquer avec un service tiers via une API RESTful.
*/Contrôle et configuration : Certains endpoints peuvent être utilisés pour surveiller l'état de l'application,
 récupérer des métriques de performance, modifier la configuration de l'application

/****************************************************************************************************************************************************************************************************************************************************************************/
2/c'est quoi cette code c'estquoi leur role management.endpoints.web.exposure.include=*
La ligne de configuration management.endpoints.web.exposure.include=*
 est utilisée dans Spring Boot pour exposer tous les endpoints actifs (gestion des points de terminaison) via l'interface web de gestion de l'application.

Dans les applications Spring Boot, certains endpoints sont exposés par défaut via l'interface de gestion actuator.
 Cela inclut des endpoints tels que /health (vérification de l'état de santé), /info (informations sur l'application), /metrics (métriques de performance), /env (propriétés de l'environnement), etc.

Cependant, par défaut, tous les endpoints ne sont pas exposés. Cela est fait pour des raisons de sécurité et pour éviter de révéler des informations sensibles sur l'application.

En utilisant la ligne de configuration management.endpoints.web.exposure.include=*, on spécifie à Spring Boot d'exposer tous les endpoints actifs via l'interface web de gestion, indépendamment de leur état par défaut. Cela signifie que tous les endpoints actifs seront accessibles via l'interface web de gestion de l'application.

Cependant, il convient de noter que l'exposition de tous les endpoints peut présenter des risques de sécurité dans un environnement de production, 
car cela peut révéler des informations sensibles sur l'application. 
Il est recommandé d'être sélectif dans l'exposition des endpoints et de s'assurer que seuls les endpoints nécessaires sont accessibles publiquement.
