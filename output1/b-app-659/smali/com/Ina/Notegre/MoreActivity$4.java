class com.Ina.Notegre.MoreActivity$4 implements android.content.DialogInterface$OnClickListener {
	 /* .source "MoreActivity.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/Ina/Notegre/MoreActivity;->reduction()Z */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.Ina.Notegre.MoreActivity this$0; //synthetic
/* # direct methods */
 com.Ina.Notegre.MoreActivity$4 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 1 */
this.this$0 = p1;
/* .line 187 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void onClick ( android.content.DialogInterface p0, Integer p1 ) {
/* .locals 18 */
/* .param p1, "dialog" # Landroid/content/DialogInterface; */
/* .param p2, "which" # I */
/* .prologue */
/* .line 193 */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* move-object/from16 v0, p0 */
v2 = this.this$0;
com.Ina.Notegre.MoreActivity .access$3 ( v2 );
java.lang.String .valueOf ( v2 );
/* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
final String v2 = "/SimpleNote/backup.xml"; // const-string v2, "/SimpleNote/backup.xml"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 194 */
/* .local v17, "pathString":Ljava/lang/String; */
/* new-instance v10, Ljava/io/File; */
/* move-object/from16 v0, v17 */
/* invoke-direct {v10, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V */
/* .line 195 */
/* .local v10, "file":Ljava/io/File; */
v1 = (( java.io.File ) v10 ).exists ( ); // invoke-virtual {v10}, Ljava/io/File;->exists()Z
/* if-nez v1, :cond_0 */
/* .line 197 */
/* move-object/from16 v0, p0 */
v1 = this.this$0;
/* move-object/from16 v0, p0 */
v2 = this.this$0;
/* const v3, 0x7f070024 */
(( com.Ina.Notegre.MoreActivity ) v2 ).getString ( v3 ); // invoke-virtual {v2, v3}, Lcom/Ina/Notegre/MoreActivity;->getString(I)Ljava/lang/String;
int v3 = 0; // const/4 v3, 0x0
android.widget.Toast .makeText ( v1,v2,v3 );
(( android.widget.Toast ) v1 ).show ( ); // invoke-virtual {v1}, Landroid/widget/Toast;->show()V
/* .line 243 */
} // :goto_0
return;
/* .line 201 */
} // :cond_0
javax.xml.parsers.SAXParserFactory .newInstance ( );
/* .line 204 */
/* .local v9, "factory":Ljavax/xml/parsers/SAXParserFactory; */
try { // :try_start_0
(( javax.xml.parsers.SAXParserFactory ) v9 ).newSAXParser ( ); // invoke-virtual {v9}, Ljavax/xml/parsers/SAXParserFactory;->newSAXParser()Ljavax/xml/parsers/SAXParser;
/* .line 205 */
/* .local v7, "asxParser":Ljavax/xml/parsers/SAXParser; */
/* new-instance v14, Lcom/Ina/Notegre/MyDefaultHandler; */
/* invoke-direct {v14}, Lcom/Ina/Notegre/MyDefaultHandler;-><init>()V */
/* .line 207 */
/* .local v14, "myDefaultHandler":Lcom/Ina/Notegre/MyDefaultHandler; */
(( javax.xml.parsers.SAXParser ) v7 ).parse ( v10, v14 ); // invoke-virtual {v7, v10, v14}, Ljavax/xml/parsers/SAXParser;->parse(Ljava/io/File;Lorg/xml/sax/helpers/DefaultHandler;)V
/* .line 209 */
/* new-instance v8, Ljava/util/ArrayList; */
/* invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V */
/* .line 210 */
/* .local v8, "conlist":Ljava/util/List;, "Ljava/util/List<Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;>;" */
/* new-instance v11, Ljava/util/ArrayList; */
/* invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V */
/* .line 211 */
/* .local v11, "folList":Ljava/util/List;, "Ljava/util/List<Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;>;" */
v8 = this.mConList;
/* .line 212 */
v11 = this.mFolList;
v15 = /* .line 214 */
/* .line 215 */
/* .local v15, "nCount":I */
int v12 = 0; // const/4 v12, 0x0
/* .local v12, "i":I */
} // :goto_1
/* if-lt v12, v15, :cond_1 */
v15 = /* .line 225 */
/* .line 226 */
int v12 = 0; // const/4 v12, 0x0
} // :goto_2
/* if-lt v12, v15, :cond_2 */
/* .line 237 */
/* move-object/from16 v0, p0 */
v1 = this.this$0;
/* move-object/from16 v0, p0 */
v2 = this.this$0;
/* const v3, 0x7f070025 */
(( com.Ina.Notegre.MoreActivity ) v2 ).getString ( v3 ); // invoke-virtual {v2, v3}, Lcom/Ina/Notegre/MoreActivity;->getString(I)Ljava/lang/String;
int v3 = 0; // const/4 v3, 0x0
android.widget.Toast .makeText ( v1,v2,v3 );
(( android.widget.Toast ) v1 ).show ( ); // invoke-virtual {v1}, Landroid/widget/Toast;->show()V
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 242 */
} // .end local v7 # "asxParser":Ljavax/xml/parsers/SAXParser;
} // .end local v8 # "conlist":Ljava/util/List;, "Ljava/util/List<Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;>;"
} // .end local v11 # "folList":Ljava/util/List;, "Ljava/util/List<Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;>;"
} // .end local v12 # "i":I
} // .end local v14 # "myDefaultHandler":Lcom/Ina/Notegre/MyDefaultHandler;
} // .end local v15 # "nCount":I
} // :goto_3
int v1 = 1; // const/4 v1, 0x1
com.Ina.Notegre.GlobalValues.bUpdate = (v1!= 0);
/* .line 217 */
/* .restart local v7 # "asxParser":Ljavax/xml/parsers/SAXParser; */
/* .restart local v8 # "conlist":Ljava/util/List;, "Ljava/util/List<Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;>;" */
/* .restart local v11 # "folList":Ljava/util/List;, "Ljava/util/List<Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;>;" */
/* .restart local v12 # "i":I */
/* .restart local v14 # "myDefaultHandler":Lcom/Ina/Notegre/MyDefaultHandler; */
/* .restart local v15 # "nCount":I */
} // :cond_1
try { // :try_start_1
/* check-cast v13, Ljava/util/Map; */
/* .line 218 */
/* .local v13, "map":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;" */
final String v1 = "id"; // const-string v1, "id"
(( java.lang.Object ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;
v16 = java.lang.Integer .parseInt ( v1 );
/* .line 219 */
/* .local v16, "nId":I */
/* move-object/from16 v0, p0 */
v1 = this.this$0;
com.Ina.Notegre.MoreActivity .access$7 ( v1 );
/* move/from16 v0, v16 */
(( com.Ina.Notegre.SqlData ) v1 ).deleteFolder ( v0 ); // invoke-virtual {v1, v0}, Lcom/Ina/Notegre/SqlData;->deleteFolder(I)V
/* .line 221 */
/* move-object/from16 v0, p0 */
v1 = this.this$0;
com.Ina.Notegre.MoreActivity .access$7 ( v1 );
final String v2 = "id"; // const-string v2, "id"
(( java.lang.Object ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;
v2 = java.lang.Integer .parseInt ( v2 );
/* .line 222 */
final String v3 = "name"; // const-string v3, "name"
(( java.lang.Object ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;
/* .line 221 */
(( com.Ina.Notegre.SqlData ) v1 ).insertFolder ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Lcom/Ina/Notegre/SqlData;->insertFolder(ILjava/lang/String;)J
/* .line 215 */
/* add-int/lit8 v12, v12, 0x1 */
/* .line 228 */
} // .end local v13 # "map":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;"
} // .end local v16 # "nId":I
} // :cond_2
/* check-cast v13, Ljava/util/Map; */
/* .line 229 */
/* .restart local v13 # "map":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;" */
final String v1 = "id"; // const-string v1, "id"
(( java.lang.Object ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;
v16 = java.lang.Integer .parseInt ( v1 );
/* .line 230 */
/* .restart local v16 # "nId":I */
/* move-object/from16 v0, p0 */
v1 = this.this$0;
com.Ina.Notegre.MoreActivity .access$7 ( v1 );
/* move/from16 v0, v16 */
(( com.Ina.Notegre.SqlData ) v1 ).delete ( v0 ); // invoke-virtual {v1, v0}, Lcom/Ina/Notegre/SqlData;->delete(I)V
/* .line 232 */
/* move-object/from16 v0, p0 */
v1 = this.this$0;
com.Ina.Notegre.MoreActivity .access$7 ( v1 );
final String v2 = "id"; // const-string v2, "id"
(( java.lang.Object ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;
v2 = java.lang.Integer .parseInt ( v2 );
/* .line 233 */
final String v3 = "title"; // const-string v3, "title"
(( java.lang.Object ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;
final String v4 = "content"; // const-string v4, "content"
(( java.lang.Object ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;
/* .line 234 */
final String v5 = "time"; // const-string v5, "time"
(( java.lang.Object ) v5 ).toString ( ); // invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;
final String v6 = "folder_index"; // const-string v6, "folder_index"
(( java.lang.Object ) v6 ).toString ( ); // invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;
v6 = java.lang.Integer .parseInt ( v6 );
/* .line 232 */
/* invoke-virtual/range {v1 ..v6}, Lcom/Ina/Notegre/SqlData;->insert(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)J */
/* :try_end_1 */
/* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_0 */
/* .line 226 */
/* add-int/lit8 v12, v12, 0x1 */
/* goto/16 :goto_2 */
/* .line 238 */
} // .end local v7 # "asxParser":Ljavax/xml/parsers/SAXParser;
} // .end local v8 # "conlist":Ljava/util/List;, "Ljava/util/List<Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;>;"
} // .end local v11 # "folList":Ljava/util/List;, "Ljava/util/List<Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;>;"
} // .end local v12 # "i":I
} // .end local v13 # "map":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;"
} // .end local v14 # "myDefaultHandler":Lcom/Ina/Notegre/MyDefaultHandler;
} // .end local v15 # "nCount":I
} // .end local v16 # "nId":I
/* :catch_0 */
/* move-exception v1 */
/* goto/16 :goto_3 */
} // .end method
