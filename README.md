
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
