public class com.ansca.corona.ResourceServices {
	 /* .source "ResourceServices.java" */
	 /* # static fields */
	 public static final Integer INVALID_RESOURCE_ID;
	 private static java.lang.String sPackageName;
	 private static java.lang.Class sRClass;
	 /* # direct methods */
	 static com.ansca.corona.ResourceServices ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 22 */
		 /* .line 25 */
		 return;
	 } // .end method
	 private com.ansca.corona.ResourceServices ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 29 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 30 */
		 return;
	 } // .end method
	 public static Integer getDrawableResourceId ( java.lang.String p0 ) {
		 /* .locals 1 */
		 /* .param p0, "resourceName" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 125 */
		 final String v0 = "drawable"; // const-string v0, "drawable"
		 v0 = 		 com.ansca.corona.ResourceServices .getResourceId ( p0,v0 );
	 } // .end method
	 public static Integer getLayoutResourceId ( java.lang.String p0 ) {
		 /* .locals 1 */
		 /* .param p0, "resourceName" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 136 */
		 final String v0 = "layout"; // const-string v0, "layout"
		 v0 = 		 com.ansca.corona.ResourceServices .getResourceId ( p0,v0 );
	 } // .end method
	 public static java.lang.String getPackageName ( ) {
		 /* .locals 3 */
		 /* .prologue */
		 /* .line 39 */
		 v2 = com.ansca.corona.ResourceServices.sPackageName;
		 /* if-nez v2, :cond_0 */
		 /* .line 40 */
		 final String v2 = ""; // const-string v2, ""
		 /* .line 41 */
		 com.ansca.corona.ResourceServices .getRClass ( );
		 /* .line 42 */
		 /* .local v1, "rClass":Ljava/lang/Class; */
		 if ( v1 != null) { // if-eqz v1, :cond_0
			 /* .line 43 */
			 (( java.lang.Class ) v1 ).getPackage ( ); // invoke-virtual {v1}, Ljava/lang/Class;->getPackage()Ljava/lang/Package;
			 /* .line 44 */
			 /* .local v0, "packageInfo":Ljava/lang/Package; */
			 if ( v0 != null) { // if-eqz v0, :cond_0
				 /* .line 45 */
				 (( java.lang.Package ) v0 ).getName ( ); // invoke-virtual {v0}, Ljava/lang/Package;->getName()Ljava/lang/String;
				 /* .line 51 */
			 } // .end local v0 # "packageInfo":Ljava/lang/Package;
		 } // :cond_0
		 v2 = com.ansca.corona.ResourceServices.sPackageName;
	 } // .end method
	 public static java.lang.Class getRClass ( ) {
		 /* .locals 2 */
		 /* .prologue */
		 /* .line 60 */
		 v0 = com.ansca.corona.ResourceServices.sRClass;
		 /* if-nez v0, :cond_0 */
		 /* .line 63 */
		 try { // :try_start_0
			 /* new-instance v0, Ljava/lang/StringBuilder; */
			 /* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
			 com.ansca.corona.CoronaEnvironment .getApplicationContext ( );
			 (( android.content.Context ) v1 ).getPackageName ( ); // invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
			 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 final String v1 = ".R"; // const-string v1, ".R"
			 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
			 java.lang.Class .forName ( v0 );
			 /* :try_end_0 */
			 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_1 */
			 /* .line 70 */
		 } // :goto_0
		 v0 = com.ansca.corona.ResourceServices.sRClass;
		 /* if-nez v0, :cond_0 */
		 /* .line 71 */
		 try { // :try_start_1
			 /* new-instance v0, Ljava/lang/StringBuilder; */
			 /* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
			 /* const-class v1, Lcom/ansca/corona/ResourceServices; */
			 (( java.lang.Class ) v1 ).getPackage ( ); // invoke-virtual {v1}, Ljava/lang/Class;->getPackage()Ljava/lang/Package;
			 (( java.lang.Package ) v1 ).getName ( ); // invoke-virtual {v1}, Ljava/lang/Package;->getName()Ljava/lang/String;
			 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 final String v1 = ".R"; // const-string v1, ".R"
			 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
			 java.lang.Class .forName ( v0 );
			 /* :try_end_1 */
			 /* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_0 */
			 /* .line 77 */
		 } // :cond_0
	 } // :goto_1
	 v0 = com.ansca.corona.ResourceServices.sRClass;
	 /* .line 72 */
	 /* :catch_0 */
	 /* move-exception v0 */
	 /* .line 64 */
	 /* :catch_1 */
	 /* move-exception v0 */
} // .end method
public static Integer getResourceId ( java.lang.String p0, java.lang.String p1 ) {
	 /* .locals 3 */
	 /* .param p0, "resourceName" # Ljava/lang/String; */
	 /* .param p1, "typeName" # Ljava/lang/String; */
	 /* .prologue */
	 int v1 = 0; // const/4 v1, 0x0
	 /* .line 105 */
	 if ( p0 != null) { // if-eqz p0, :cond_0
		 v2 = 		 (( java.lang.String ) p0 ).length ( ); // invoke-virtual {p0}, Ljava/lang/String;->length()I
		 /* if-gtz v2, :cond_1 */
		 /* .line 114 */
	 } // :cond_0
} // :goto_0
/* .line 110 */
} // :cond_1
com.ansca.corona.ResourceServices .getResources ( );
/* .line 111 */
/* .local v0, "resources":Landroid/content/res/Resources; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 114 */
com.ansca.corona.ResourceServices .getPackageName ( );
v1 = (( android.content.res.Resources ) v0 ).getIdentifier ( p0, p1, v1 ); // invoke-virtual {v0, p0, p1, v1}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
} // .end method
public static android.content.res.Resources getResources ( ) {
/* .locals 2 */
/* .prologue */
/* .line 86 */
com.ansca.corona.CoronaEnvironment .getApplicationContext ( );
/* .line 87 */
/* .local v0, "context":Landroid/content/Context; */
/* if-nez v0, :cond_0 */
/* .line 88 */
int v1 = 0; // const/4 v1, 0x0
/* .line 90 */
} // :goto_0
} // :cond_0
(( android.content.Context ) v0 ).getResources ( ); // invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
} // .end method
public static Integer getStringResourceId ( java.lang.String p0 ) {
/* .locals 1 */
/* .param p0, "resourceName" # Ljava/lang/String; */
/* .prologue */
/* .line 147 */
final String v0 = "string"; // const-string v0, "string"
v0 = com.ansca.corona.ResourceServices .getResourceId ( p0,v0 );
} // .end method
