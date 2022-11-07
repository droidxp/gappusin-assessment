public class com.openfeint.api.OpenFeintSettings {
	 /* .source "OpenFeintSettings.java" */
	 /* # static fields */
	 public static final java.lang.String CloudStorageCompressionStrategyDefault;
	 public static final java.lang.String CloudStorageCompressionStrategyLegacyHeaderlessCompression;
	 public static final java.lang.String CloudStorageCompressionStrategyNoCompression;
	 public static final java.lang.String RequestedOrientation;
	 public static final java.lang.String SettingCloudStorageCompressionStrategy;
	 /* # instance fields */
	 public java.lang.String id;
	 public java.lang.String key;
	 public java.lang.String name;
	 public java.lang.String secret;
	 public java.util.Map settings;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/Map", */
	 /* "<", */
	 /* "Ljava/lang/String;", */
	 /* "Ljava/lang/Object;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
/* # direct methods */
public com.openfeint.api.OpenFeintSettings ( ) {
/* .locals 1 */
/* .param p1, "_name" # Ljava/lang/String; */
/* .param p2, "_key" # Ljava/lang/String; */
/* .param p3, "_secret" # Ljava/lang/String; */
/* .param p4, "_id" # Ljava/lang/String; */
/* .prologue */
/* .line 25 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 26 */
this.name = p1;
/* .line 27 */
this.key = p2;
/* .line 28 */
this.secret = p3;
/* .line 29 */
this.id = p4;
/* .line 30 */
/* new-instance v0, Ljava/util/HashMap; */
/* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
this.settings = v0;
/* .line 31 */
return;
} // .end method
public com.openfeint.api.OpenFeintSettings ( ) {
/* .locals 0 */
/* .param p1, "_name" # Ljava/lang/String; */
/* .param p2, "_key" # Ljava/lang/String; */
/* .param p3, "_secret" # Ljava/lang/String; */
/* .param p4, "_id" # Ljava/lang/String; */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/String;", */
/* "Ljava/util/Map", */
/* "<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/Object;", */
/* ">;)V" */
/* } */
} // .end annotation
/* .prologue */
/* .line 43 */
/* .local p5, "_settings":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;" */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 44 */
this.name = p1;
/* .line 45 */
this.key = p2;
/* .line 46 */
this.secret = p3;
/* .line 47 */
this.id = p4;
/* .line 48 */
this.settings = p5;
/* .line 49 */
return;
} // .end method
/* # virtual methods */
public void applyOverrides ( java.util.Properties p0 ) {
/* .locals 2 */
/* .param p1, "settings" # Ljava/util/Properties; */
/* .prologue */
/* .line 80 */
/* if-nez p1, :cond_1 */
/* .line 95 */
} // :cond_0
} // :goto_0
return;
/* .line 84 */
} // :cond_1
final String v1 = "app-id"; // const-string v1, "app-id"
(( java.util.Properties ) p1 ).getProperty ( v1 ); // invoke-virtual {p1, v1}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;
/* .line 85 */
/* .local v0, "property":Ljava/lang/String; */
if ( v0 != null) { // if-eqz v0, :cond_2
this.id = v0;
/* .line 87 */
} // :cond_2
final String v1 = "game-name"; // const-string v1, "game-name"
(( java.util.Properties ) p1 ).getProperty ( v1 ); // invoke-virtual {p1, v1}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;
/* .line 88 */
if ( v0 != null) { // if-eqz v0, :cond_3
this.name = v0;
/* .line 90 */
} // :cond_3
final String v1 = "app-key"; // const-string v1, "app-key"
(( java.util.Properties ) p1 ).getProperty ( v1 ); // invoke-virtual {p1, v1}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;
/* .line 91 */
if ( v0 != null) { // if-eqz v0, :cond_4
this.key = v0;
/* .line 93 */
} // :cond_4
final String v1 = "app-secret"; // const-string v1, "app-secret"
(( java.util.Properties ) p1 ).getProperty ( v1 ); // invoke-virtual {p1, v1}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;
/* .line 94 */
if ( v0 != null) { // if-eqz v0, :cond_0
this.secret = v0;
} // .end method
public void verify ( ) {
/* .locals 2 */
/* .prologue */
/* .line 98 */
int v0 = 0; // const/4 v0, 0x0
/* .line 100 */
/* .local v0, "verificationError":Ljava/lang/String; */
v1 = this.key;
/* if-nez v1, :cond_2 */
/* .line 101 */
com.openfeint.internal.OpenFeintInternal .getRString ( v1 );
/* .line 110 */
} // :cond_0
} // :goto_0
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 111 */
final String v1 = "OpenFeintSettings"; // const-string v1, "OpenFeintSettings"
com.openfeint.internal.OpenFeintInternal .log ( v1,v0 );
/* .line 112 */
com.openfeint.internal.OpenFeintInternal .getInstance ( );
(( com.openfeint.internal.OpenFeintInternal ) v1 ).displayErrorDialog ( v0 ); // invoke-virtual {v1, v0}, Lcom/openfeint/internal/OpenFeintInternal;->displayErrorDialog(Ljava/lang/CharSequence;)V
/* .line 114 */
} // :cond_1
return;
/* .line 103 */
} // :cond_2
v1 = this.secret;
/* if-nez v1, :cond_3 */
/* .line 104 */
com.openfeint.internal.OpenFeintInternal .getRString ( v1 );
/* .line 105 */
} // :cond_3
v1 = this.id;
/* if-nez v1, :cond_4 */
/* .line 106 */
com.openfeint.internal.OpenFeintInternal .getRString ( v1 );
/* .line 107 */
} // :cond_4
v1 = this.name;
/* if-nez v1, :cond_0 */
/* .line 108 */
com.openfeint.internal.OpenFeintInternal .getRString ( v1 );
} // .end method
