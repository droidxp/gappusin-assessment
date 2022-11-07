public class com.ansca.corona.purchasing.StoreName {
	 /* .source "StoreName.java" */
	 /* # static fields */
	 public static final java.lang.String AMAZON;
	 public static final java.lang.String GOOGLE;
	 public static final java.lang.String NONE;
	 public static final java.lang.String UNKNOWN;
	 /* # direct methods */
	 private com.ansca.corona.purchasing.StoreName ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 12 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 13 */
		 return;
	 } // .end method
	 public static java.lang.String fromPackageName ( java.lang.String p0 ) {
		 /* .locals 2 */
		 /* .param p0, "packageName" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 67 */
		 if ( p0 != null) { // if-eqz p0, :cond_0
			 v1 = 			 (( java.lang.String ) p0 ).length ( ); // invoke-virtual {p0}, Ljava/lang/String;->length()I
			 /* if-gtz v1, :cond_1 */
			 /* .line 68 */
		 } // :cond_0
		 final String v0 = "none"; // const-string v0, "none"
		 /* .line 80 */
		 /* .local v0, "storeName":Ljava/lang/String; */
	 } // :goto_0
	 /* .line 70 */
} // .end local v0 # "storeName":Ljava/lang/String;
} // :cond_1
final String v1 = "com.android.vending"; // const-string v1, "com.android.vending"
v1 = (( java.lang.String ) p0 ).equals ( v1 ); // invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v1, :cond_2 */
final String v1 = "com.google.android.feedback"; // const-string v1, "com.google.android.feedback"
v1 = (( java.lang.String ) p0 ).equals ( v1 ); // invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_3
/* .line 72 */
} // :cond_2
final String v0 = "google"; // const-string v0, "google"
/* .restart local v0 # "storeName":Ljava/lang/String; */
/* .line 74 */
} // .end local v0 # "storeName":Ljava/lang/String;
} // :cond_3
final String v1 = "com.amazon.venezia"; // const-string v1, "com.amazon.venezia"
v1 = (( java.lang.String ) p0 ).equals ( v1 ); // invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_4
/* .line 75 */
final String v0 = "amazon"; // const-string v0, "amazon"
/* .restart local v0 # "storeName":Ljava/lang/String; */
/* .line 78 */
} // .end local v0 # "storeName":Ljava/lang/String;
} // :cond_4
final String v0 = "unknown"; // const-string v0, "unknown"
/* .restart local v0 # "storeName":Ljava/lang/String; */
} // .end method
public static Boolean isNotValid ( java.lang.String p0 ) {
/* .locals 1 */
/* .param p0, "storeName" # Ljava/lang/String; */
/* .prologue */
/* .line 53 */
v0 = com.ansca.corona.purchasing.StoreName .isValid ( p0 );
/* if-nez v0, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public static Boolean isValid ( java.lang.String p0 ) {
/* .locals 1 */
/* .param p0, "storeName" # Ljava/lang/String; */
/* .prologue */
/* .line 38 */
if ( p0 != null) { // if-eqz p0, :cond_1
/* .line 39 */
final String v0 = "google"; // const-string v0, "google"
v0 = (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v0, :cond_0 */
final String v0 = "amazon"; // const-string v0, "amazon"
v0 = (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 40 */
} // :cond_0
int v0 = 1; // const/4 v0, 0x1
/* .line 43 */
} // :goto_0
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
} // .end method
