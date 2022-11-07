public class com.ansca.corona.SmsSettings {
	 /* .source "SmsSettings.java" */
	 /* # instance fields */
	 private java.util.LinkedHashSet fRecipients;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/LinkedHashSet", */
	 /* "<", */
	 /* "Ljava/lang/String;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
private java.lang.String fText;
/* # direct methods */
public com.ansca.corona.SmsSettings ( ) {
/* .locals 1 */
/* .prologue */
/* .line 17 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 18 */
/* new-instance v0, Ljava/util/LinkedHashSet; */
/* invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V */
this.fRecipients = v0;
/* .line 19 */
final String v0 = ""; // const-string v0, ""
this.fText = v0;
/* .line 20 */
return;
} // .end method
public static com.ansca.corona.SmsSettings from ( java.util.HashMap p0 ) {
/* .locals 11 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/HashMap", */
/* "<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/Object;", */
/* ">;)", */
/* "Lcom/ansca/corona/SmsSettings;" */
/* } */
} // .end annotation
/* .prologue */
/* .line 83 */
/* .local p0, "collection":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Object;>;" */
/* new-instance v7, Lcom/ansca/corona/SmsSettings; */
/* invoke-direct {v7}, Lcom/ansca/corona/SmsSettings;-><init>()V */
/* .line 86 */
/* .local v7, "settings":Lcom/ansca/corona/SmsSettings; */
/* if-nez p0, :cond_1 */
/* .line 132 */
} // :cond_0
/* .line 91 */
} // :cond_1
(( java.util.HashMap ) p0 ).entrySet ( ); // invoke-virtual {p0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;
} // :cond_2
v10 = } // :goto_0
if ( v10 != null) { // if-eqz v10, :cond_0
/* check-cast v1, Ljava/util/Map$Entry; */
/* .line 93 */
/* .local v1, "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;Ljava/lang/Object;>;" */
/* check-cast v4, Ljava/lang/String; */
/* .line 94 */
/* .local v4, "keyName":Ljava/lang/String; */
/* .line 95 */
/* .local v9, "value":Ljava/lang/Object; */
if ( v4 != null) { // if-eqz v4, :cond_2
v10 = (( java.lang.String ) v4 ).length ( ); // invoke-virtual {v4}, Ljava/lang/String;->length()I
/* if-lez v10, :cond_2 */
if ( v9 != null) { // if-eqz v9, :cond_2
/* .line 100 */
(( java.lang.String ) v4 ).toLowerCase ( ); // invoke-virtual {v4}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;
(( java.lang.String ) v10 ).trim ( ); // invoke-virtual {v10}, Ljava/lang/String;->trim()Ljava/lang/String;
/* .line 101 */
final String v10 = "to"; // const-string v10, "to"
v10 = (( java.lang.String ) v4 ).equals ( v10 ); // invoke-virtual {v4, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v10 != null) { // if-eqz v10, :cond_7
/* .line 102 */
/* instance-of v10, v9, Ljava/lang/String; */
if ( v10 != null) { // if-eqz v10, :cond_3
/* .line 103 */
(( com.ansca.corona.SmsSettings ) v7 ).getRecipients ( ); // invoke-virtual {v7}, Lcom/ansca/corona/SmsSettings;->getRecipients()Ljava/util/LinkedHashSet;
/* check-cast v9, Ljava/lang/String; */
} // .end local v9 # "value":Ljava/lang/Object;
(( java.util.LinkedHashSet ) v10 ).add ( v9 ); // invoke-virtual {v10, v9}, Ljava/util/LinkedHashSet;->add(Ljava/lang/Object;)Z
/* .line 105 */
/* .restart local v9 # "value":Ljava/lang/Object; */
} // :cond_3
/* instance-of v10, v9, [Ljava/lang/String; */
if ( v10 != null) { // if-eqz v10, :cond_4
/* .line 106 */
/* check-cast v9, [Ljava/lang/String; */
} // .end local v9 # "value":Ljava/lang/Object;
/* move-object v0, v9 */
/* check-cast v0, [Ljava/lang/String; */
/* .local v0, "arr$":[Ljava/lang/String; */
/* array-length v5, v0 */
/* .local v5, "len$":I */
int v3 = 0; // const/4 v3, 0x0
/* .local v3, "i$":I */
} // :goto_1
/* if-ge v3, v5, :cond_2 */
/* aget-object v8, v0, v3 */
/* .line 107 */
/* .local v8, "text":Ljava/lang/String; */
(( com.ansca.corona.SmsSettings ) v7 ).getRecipients ( ); // invoke-virtual {v7}, Lcom/ansca/corona/SmsSettings;->getRecipients()Ljava/util/LinkedHashSet;
(( java.util.LinkedHashSet ) v10 ).add ( v8 ); // invoke-virtual {v10, v8}, Ljava/util/LinkedHashSet;->add(Ljava/lang/Object;)Z
/* .line 106 */
/* add-int/lit8 v3, v3, 0x1 */
/* .line 110 */
} // .end local v0 # "arr$":[Ljava/lang/String;
} // .end local v3 # "i$":I
} // .end local v5 # "len$":I
} // .end local v8 # "text":Ljava/lang/String;
/* .restart local v9 # "value":Ljava/lang/Object; */
} // :cond_4
/* instance-of v10, v9, Ljava/util/HashMap; */
if ( v10 != null) { // if-eqz v10, :cond_6
/* .line 111 */
/* check-cast v9, Ljava/util/HashMap; */
} // .end local v9 # "value":Ljava/lang/Object;
(( java.util.HashMap ) v9 ).values ( ); // invoke-virtual {v9}, Ljava/util/HashMap;->values()Ljava/util/Collection;
/* .local v3, "i$":Ljava/util/Iterator; */
} // :cond_5
v10 = } // :goto_2
if ( v10 != null) { // if-eqz v10, :cond_2
/* .line 112 */
/* .local v6, "nextObject":Ljava/lang/Object; */
/* instance-of v10, v6, Ljava/lang/String; */
if ( v10 != null) { // if-eqz v10, :cond_5
/* .line 113 */
(( com.ansca.corona.SmsSettings ) v7 ).getRecipients ( ); // invoke-virtual {v7}, Lcom/ansca/corona/SmsSettings;->getRecipients()Ljava/util/LinkedHashSet;
/* check-cast v6, Ljava/lang/String; */
} // .end local v6 # "nextObject":Ljava/lang/Object;
(( java.util.LinkedHashSet ) v10 ).add ( v6 ); // invoke-virtual {v10, v6}, Ljava/util/LinkedHashSet;->add(Ljava/lang/Object;)Z
/* .line 117 */
} // .end local v3 # "i$":Ljava/util/Iterator;
/* .restart local v9 # "value":Ljava/lang/Object; */
} // :cond_6
/* instance-of v10, v9, Ljava/util/Collection; */
if ( v10 != null) { // if-eqz v10, :cond_2
/* .line 119 */
try { // :try_start_0
(( com.ansca.corona.SmsSettings ) v7 ).getRecipients ( ); // invoke-virtual {v7}, Lcom/ansca/corona/SmsSettings;->getRecipients()Ljava/util/LinkedHashSet;
/* check-cast v9, Ljava/util/Collection; */
} // .end local v9 # "value":Ljava/lang/Object;
(( java.util.LinkedHashSet ) v10 ).addAll ( v9 ); // invoke-virtual {v10, v9}, Ljava/util/LinkedHashSet;->addAll(Ljava/util/Collection;)Z
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* goto/16 :goto_0 */
/* .line 121 */
/* :catch_0 */
/* move-exception v10 */
/* goto/16 :goto_0 */
/* .line 124 */
/* .restart local v9 # "value":Ljava/lang/Object; */
} // :cond_7
final String v10 = "body"; // const-string v10, "body"
v10 = (( java.lang.String ) v4 ).equals ( v10 ); // invoke-virtual {v4, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v10 != null) { // if-eqz v10, :cond_2
/* .line 125 */
/* instance-of v10, v9, Ljava/lang/String; */
if ( v10 != null) { // if-eqz v10, :cond_2
/* .line 126 */
/* check-cast v9, Ljava/lang/String; */
} // .end local v9 # "value":Ljava/lang/Object;
(( com.ansca.corona.SmsSettings ) v7 ).setText ( v9 ); // invoke-virtual {v7, v9}, Lcom/ansca/corona/SmsSettings;->setText(Ljava/lang/String;)V
/* goto/16 :goto_0 */
} // .end method
/* # virtual methods */
public java.util.LinkedHashSet getRecipients ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/util/LinkedHashSet", */
/* "<", */
/* "Ljava/lang/String;", */
/* ">;" */
/* } */
} // .end annotation
/* .prologue */
/* .line 27 */
v0 = this.fRecipients;
} // .end method
public java.lang.String getText ( ) {
/* .locals 1 */
/* .prologue */
/* .line 35 */
v0 = this.fText;
} // .end method
public void setText ( java.lang.String p0 ) {
/* .locals 0 */
/* .param p1, "text" # Ljava/lang/String; */
/* .prologue */
/* .line 43 */
if ( p1 != null) { // if-eqz p1, :cond_0
} // .end local p1 # "text":Ljava/lang/String;
} // :goto_0
this.fText = p1;
/* .line 44 */
return;
/* .line 43 */
/* .restart local p1 # "text":Ljava/lang/String; */
} // :cond_0
final String p1 = ""; // const-string p1, ""
} // .end method
public android.content.Intent toIntent ( ) {
/* .locals 7 */
/* .prologue */
/* .line 53 */
/* new-instance v2, Landroid/content/Intent; */
final String v5 = "android.intent.action.VIEW"; // const-string v5, "android.intent.action.VIEW"
/* invoke-direct {v2, v5}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V */
/* .line 54 */
/* .local v2, "intent":Landroid/content/Intent; */
final String v5 = "vnd.android-dir/mms-sms"; // const-string v5, "vnd.android-dir/mms-sms"
(( android.content.Intent ) v2 ).setType ( v5 ); // invoke-virtual {v2, v5}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;
/* .line 55 */
v5 = this.fRecipients;
v5 = (( java.util.LinkedHashSet ) v5 ).size ( ); // invoke-virtual {v5}, Ljava/util/LinkedHashSet;->size()I
/* if-lez v5, :cond_3 */
/* .line 56 */
int v3 = 1; // const/4 v3, 0x1
/* .line 57 */
/* .local v3, "isFirstString":Z */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
/* .line 58 */
/* .local v0, "builder":Ljava/lang/StringBuilder; */
final String v5 = "sms:"; // const-string v5, "sms:"
(( java.lang.StringBuilder ) v0 ).append ( v5 ); // invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 59 */
v5 = this.fRecipients;
(( java.util.LinkedHashSet ) v5 ).iterator ( ); // invoke-virtual {v5}, Ljava/util/LinkedHashSet;->iterator()Ljava/util/Iterator;
/* .local v1, "i$":Ljava/util/Iterator; */
} // :cond_0
v5 = } // :goto_0
if ( v5 != null) { // if-eqz v5, :cond_2
/* check-cast v4, Ljava/lang/String; */
/* .line 60 */
/* .local v4, "phoneNumberString":Ljava/lang/String; */
if ( v4 != null) { // if-eqz v4, :cond_0
v5 = (( java.lang.String ) v4 ).length ( ); // invoke-virtual {v4}, Ljava/lang/String;->length()I
/* if-lez v5, :cond_0 */
/* .line 61 */
/* if-nez v3, :cond_1 */
/* .line 62 */
final String v5 = ","; // const-string v5, ","
(( java.lang.StringBuilder ) v0 ).append ( v5 ); // invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 64 */
} // :cond_1
(( java.lang.StringBuilder ) v0 ).append ( v4 ); // invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 65 */
int v3 = 0; // const/4 v3, 0x0
/* .line 68 */
} // .end local v4 # "phoneNumberString":Ljava/lang/String;
} // :cond_2
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.net.Uri .parse ( v5 );
(( android.content.Intent ) v2 ).setData ( v5 ); // invoke-virtual {v2, v5}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;
/* .line 70 */
} // .end local v0 # "builder":Ljava/lang/StringBuilder;
} // .end local v1 # "i$":Ljava/util/Iterator;
} // .end local v3 # "isFirstString":Z
} // :cond_3
v5 = this.fText;
v5 = (( java.lang.String ) v5 ).length ( ); // invoke-virtual {v5}, Ljava/lang/String;->length()I
/* if-lez v5, :cond_4 */
/* .line 71 */
final String v5 = "sms_body"; // const-string v5, "sms_body"
v6 = this.fText;
(( android.content.Intent ) v2 ).putExtra ( v5, v6 ); // invoke-virtual {v2, v5, v6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
/* .line 73 */
} // :cond_4
} // .end method
