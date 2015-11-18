# PaysServeur
Pour créer le service :
- s'assurer qu'axis2 est bien déployé dans un tomcat
- dans le fichier build.xml, modifier la propriété suivante :
  < property name="tomcat.dir" value="C:/apache-tomcat-8.0.28/webapps/axis2/WEB-INF/services" / >
  pour lui donner le bon chemin relatif
- ouvrir ant (dans Intellij, sur le coté droit, menu ant build)
- si aucune tache n'apparait, faire "+" et lui donner le fichier build.xml
- trois taches doivent apparaitre : clean, compile.service, build.service
- executer ces trois taches dans cet ordre
- si tout s'est bien passé, le fichier Pays.aar est présent dans le dossier service de axis 2
- vérfier qu'il est présent à l'url : http://localhost:8080/axis2/services/listServices
- tester l'obtention de la liste de pays à l'url : http://localhost:8080/axis2/services/PaysWebServiceService/obtainListePays
