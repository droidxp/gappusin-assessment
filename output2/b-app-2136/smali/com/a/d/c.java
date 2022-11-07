public class com.a.d.c {
	 /* # instance fields */
	 java.io.FileOutputStream a;
	 java.io.FileInputStream b;
	 java.io.DataOutputStream c;
	 java.io.DataInputStream d;
	 Integer e;
	 com.a.a.a f;
	 /* # direct methods */
	 public com.a.d.c ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 this.a = v0;
		 this.b = v0;
		 this.c = v0;
		 this.d = v0;
		 int v0 = 0; // const/4 v0, 0x0
		 /* iput v0, p0, Lcom/a/d/c;->e:I */
		 this.f = p1;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public java.io.BufferedReader a ( android.content.Context p0, java.lang.String p1 ) {
		 /* .locals 5 */
		 (( android.content.Context ) p1 ).getAssets ( ); // invoke-virtual {p1}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;
		 (( android.content.res.AssetManager ) v0 ).open ( p2 ); // invoke-virtual {v0, p2}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;
		 int v1 = 0; // const/4 v1, 0x0
		 try { // :try_start_0
			 /* new-instance v0, Ljava/io/BufferedReader; */
			 /* new-instance v3, Ljava/io/InputStreamReader; */
			 final String v4 = "gb2312"; // const-string v4, "gb2312"
			 /* invoke-direct {v3, v2, v4}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/lang/String;)V */
			 /* invoke-direct {v0, v3}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V */
			 /* :try_end_0 */
			 /* .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 ..:try_end_0} :catch_0 */
		 } // :goto_0
		 /* :catch_0 */
		 /* move-exception v0 */
		 final String v2 = "debug"; // const-string v2, "debug"
		 (( java.io.UnsupportedEncodingException ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/io/UnsupportedEncodingException;->toString()Ljava/lang/String;
		 android.util.Log .e ( v2,v0 );
		 /* move-object v0, v1 */
	 } // .end method
	 public java.util.ArrayList a ( java.lang.String p0 ) {
		 /* .locals 21 */
		 /* new-instance v15, Ljava/util/ArrayList; */
		 /* invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V */
		 try { // :try_start_0
			 /* move-object/from16 v0, p0 */
			 v2 = this.f;
			 v2 = this.a;
			 /* move-object/from16 v0, p0 */
			 /* move-object/from16 v1, p1 */
			 (( com.a.d.c ) v0 ).a ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Lcom/a/d/c;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/io/BufferedReader;
			 int v4 = 0; // const/4 v4, 0x0
			 int v3 = 0; // const/4 v3, 0x0
			 int v2 = 5; // const/4 v2, 0x5
			 /* new-array v0, v2, [C */
			 /* move-object/from16 v18, v0 */
			 /* const/16 v2, 0xe */
			 /* new-array v0, v2, [I */
			 /* move-object/from16 v19, v0 */
		 } // :goto_0
		 /* invoke-virtual/range {v17 ..v17}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String; */
		 /* if-nez v20, :cond_0 */
	 } // :goto_1
	 /* move-object v2, v15 */
} // :goto_2
} // :cond_0
int v2 = 0; // const/4 v2, 0x0
/* move/from16 v16, v2 */
/* move v2, v3 */
/* move v3, v4 */
} // :goto_3
v4 = /* invoke-virtual/range {v20 ..v20}, Ljava/lang/String;->length()I */
/* move/from16 v0, v16 */
/* if-lt v0, v4, :cond_1 */
/* move v4, v3 */
/* move v3, v2 */
} // :cond_1
/* move-object/from16 v0, v20 */
/* move/from16 v1, v16 */
v4 = (( java.lang.String ) v0 ).charAt ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C
/* const/16 v5, 0xd */
/* if-eq v4, v5, :cond_2 */
/* const/16 v5, 0xa */
/* if-eq v4, v5, :cond_2 */
/* const/16 v5, 0x20 */
/* if-eq v4, v5, :cond_2 */
/* sparse-switch v4, :sswitch_data_0 */
/* aput-char v4, v18, v3 */
/* add-int/lit8 v3, v3, 0x1 */
} // :cond_2
} // :goto_4
/* add-int/lit8 v4, v16, 0x1 */
/* move/from16 v16, v4 */
/* :sswitch_0 */
int v3 = 0; // const/4 v3, 0x0
/* invoke-static/range {v18 ..v18}, Ljava/lang/String;->valueOf([C)Ljava/lang/String; */
/* move-object/from16 v0, p0 */
v4 = (( com.a.d.c ) v0 ).c ( v4 ); // invoke-virtual {v0, v4}, Lcom/a/d/c;->c(Ljava/lang/String;)I
/* aput v4, v19, v2 */
/* add-int/lit8 v2, v2, 0x1 */
/* const/16 v4, 0x20 */
/* move-object/from16 v0, v18 */
java.util.Arrays .fill ( v0,v4 );
/* :try_end_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception v2 */
(( java.io.IOException ) v2 ).printStackTrace ( ); // invoke-virtual {v2}, Ljava/io/IOException;->printStackTrace()V
/* :sswitch_1 */
try { // :try_start_1
/* add-int/lit8 v3, v3, 0x1 */
/* move-object/from16 v0, p0 */
/* iget v3, v0, Lcom/a/d/c;->e:I */
/* const/16 v4, 0x19 */
/* if-ge v3, v4, :cond_3 */
/* move-object/from16 v0, p0 */
/* iget v3, v0, Lcom/a/d/c;->e:I */
/* add-int/lit8 v3, v3, 0x1 */
/* move-object/from16 v0, p0 */
/* iput v3, v0, Lcom/a/d/c;->e:I */
} // :goto_5
int v14 = 0; // const/4 v14, 0x0
/* invoke-static/range {v18 ..v18}, Ljava/lang/String;->valueOf([C)Ljava/lang/String; */
/* move-object/from16 v0, p0 */
v3 = (( com.a.d.c ) v0 ).c ( v3 ); // invoke-virtual {v0, v3}, Lcom/a/d/c;->c(Ljava/lang/String;)I
/* aput v3, v19, v2 */
/* const/16 v2, 0x20 */
/* move-object/from16 v0, v18 */
java.util.Arrays .fill ( v0,v2 );
/* new-instance v2, Lcom/a/c/l; */
/* move-object/from16 v0, p0 */
v3 = this.f;
int v4 = 0; // const/4 v4, 0x0
/* aget v4, v19, v4 */
int v5 = 1; // const/4 v5, 0x1
/* aget v5, v19, v5 */
int v6 = 2; // const/4 v6, 0x2
/* aget v6, v19, v6 */
/* add-int/lit8 v6, v6, -0x1 */
int v7 = 3; // const/4 v7, 0x3
/* aget v7, v19, v7 */
/* add-int/lit8 v7, v7, -0x1 */
int v8 = 4; // const/4 v8, 0x4
/* aget v8, v19, v8 */
int v9 = 5; // const/4 v9, 0x5
/* aget v9, v19, v9 */
int v10 = 6; // const/4 v10, 0x6
/* aget v10, v19, v10 */
int v11 = 7; // const/4 v11, 0x7
/* aget v11, v19, v11 */
/* const/16 v12, 0x8 */
/* aget v12, v19, v12 */
/* move-object/from16 v0, p0 */
/* iget v13, v0, Lcom/a/d/c;->e:I */
/* invoke-direct/range {v2 ..v13}, Lcom/a/c/l;-><init>(Lcom/a/a/a;IIIIIIIIII)V */
(( java.util.ArrayList ) v15 ).add ( v2 ); // invoke-virtual {v15, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
int v2 = 0; // const/4 v2, 0x0
int v3 = 0; // const/4 v3, 0x0
com.a.c.j.aa = (v3!= 0);
/* move v3, v14 */
/* goto/16 :goto_4 */
} // :cond_3
/* const/16 v3, 0x19 */
/* move-object/from16 v0, p0 */
/* iput v3, v0, Lcom/a/d/c;->e:I */
/* :sswitch_2 */
/* move-object/from16 v0, p0 */
/* iget v3, v0, Lcom/a/d/c;->e:I */
/* const/16 v4, 0x19 */
/* if-ge v3, v4, :cond_4 */
/* move-object/from16 v0, p0 */
/* iget v3, v0, Lcom/a/d/c;->e:I */
/* add-int/lit8 v3, v3, 0x1 */
/* move-object/from16 v0, p0 */
/* iput v3, v0, Lcom/a/d/c;->e:I */
} // :goto_6
/* invoke-static/range {v18 ..v18}, Ljava/lang/String;->valueOf([C)Ljava/lang/String; */
/* move-object/from16 v0, p0 */
v3 = (( com.a.d.c ) v0 ).c ( v3 ); // invoke-virtual {v0, v3}, Lcom/a/d/c;->c(Ljava/lang/String;)I
/* aput v3, v19, v2 */
/* const/16 v2, 0x20 */
/* move-object/from16 v0, v18 */
java.util.Arrays .fill ( v0,v2 );
/* new-instance v2, Lcom/a/c/l; */
/* move-object/from16 v0, p0 */
v3 = this.f;
int v4 = 0; // const/4 v4, 0x0
/* aget v4, v19, v4 */
int v5 = 1; // const/4 v5, 0x1
/* aget v5, v19, v5 */
int v6 = 2; // const/4 v6, 0x2
/* aget v6, v19, v6 */
/* add-int/lit8 v6, v6, -0x1 */
int v7 = 3; // const/4 v7, 0x3
/* aget v7, v19, v7 */
/* add-int/lit8 v7, v7, -0x1 */
int v8 = 4; // const/4 v8, 0x4
/* aget v8, v19, v8 */
int v9 = 5; // const/4 v9, 0x5
/* aget v9, v19, v9 */
int v10 = 6; // const/4 v10, 0x6
/* aget v10, v19, v10 */
int v11 = 7; // const/4 v11, 0x7
/* aget v11, v19, v11 */
/* const/16 v12, 0x8 */
/* aget v12, v19, v12 */
/* move-object/from16 v0, p0 */
/* iget v13, v0, Lcom/a/d/c;->e:I */
/* invoke-direct/range {v2 ..v13}, Lcom/a/c/l;-><init>(Lcom/a/a/a;IIIIIIIIII)V */
(( java.util.ArrayList ) v15 ).add ( v2 ); // invoke-virtual {v15, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
int v2 = 1; // const/4 v2, 0x1
com.a.c.j.aa = (v2!= 0);
/* move-object v2, v15 */
/* goto/16 :goto_2 */
} // :cond_4
/* const/16 v3, 0x19 */
/* move-object/from16 v0, p0 */
/* iput v3, v0, Lcom/a/d/c;->e:I */
/* :try_end_1 */
/* .catch Ljava/io/IOException; {:try_start_1 ..:try_end_1} :catch_0 */
/* :sswitch_data_0 */
/* .sparse-switch */
/* 0x2c -> :sswitch_0 */
/* 0x3b -> :sswitch_2 */
/* 0x7c -> :sswitch_1 */
} // .end sparse-switch
} // .end method
public java.lang.String b ( android.content.Context p0, java.lang.String p1 ) {
/* .locals 5 */
/* new-instance v0, Ljava/lang/StringBuilder; */
final String v1 = "/sdcard/"; // const-string v1, "/sdcard/"
/* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v0 ).append ( p2 ); // invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
final String v1 = ""; // const-string v1, ""
try { // :try_start_0
/* new-instance v2, Ljava/io/FileInputStream; */
/* invoke-direct {v2, v0}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V */
v0 = (( java.io.FileInputStream ) v2 ).available ( ); // invoke-virtual {v2}, Ljava/io/FileInputStream;->available()I
/* new-array v0, v0, [B */
(( java.io.FileInputStream ) v2 ).read ( v0 ); // invoke-virtual {v2, v0}, Ljava/io/FileInputStream;->read([B)I
final String v3 = "UTF-8"; // const-string v3, "UTF-8"
org.apache.http.util.EncodingUtils .getString ( v0,v3 );
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
try { // :try_start_1
(( java.io.FileInputStream ) v2 ).close ( ); // invoke-virtual {v2}, Ljava/io/FileInputStream;->close()V
/* :try_end_1 */
/* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_1 */
} // :goto_0
/* :catch_0 */
/* move-exception v0 */
/* move-object v4, v0 */
/* move-object v0, v1 */
/* move-object v1, v4 */
} // :goto_1
(( java.lang.Exception ) v1 ).printStackTrace ( ); // invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V
/* :catch_1 */
/* move-exception v1 */
} // .end method
public java.util.ArrayList b ( java.lang.String p0 ) {
/* .locals 20 */
/* new-instance v16, Ljava/util/ArrayList; */
/* invoke-direct/range {v16 ..v16}, Ljava/util/ArrayList;-><init>()V */
/* move-object/from16 v0, p0 */
v2 = this.f;
v2 = this.a;
/* move-object/from16 v0, p0 */
/* move-object/from16 v1, p1 */
(( com.a.d.c ) v0 ).b ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Lcom/a/d/c;->b(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
int v4 = 0; // const/4 v4, 0x0
int v3 = 0; // const/4 v3, 0x0
int v2 = 7; // const/4 v2, 0x7
/* new-array v0, v2, [C */
/* move-object/from16 v18, v0 */
/* const/16 v2, 0xe */
/* new-array v0, v2, [I */
/* move-object/from16 v19, v0 */
v2 = java.lang.System.out;
/* new-instance v5, Ljava/lang/StringBuilder; */
final String v6 = "tmp == "; // const-string v6, "tmp == "
/* invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
/* move-object/from16 v0, v17 */
(( java.lang.StringBuilder ) v5 ).append ( v0 ); // invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v5 ).toString ( ); // invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( java.io.PrintStream ) v2 ).println ( v5 ); // invoke-virtual {v2, v5}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
} // :goto_0
/* if-nez v17, :cond_0 */
/* move-object/from16 v2, v16 */
} // :goto_1
} // :cond_0
int v2 = 0; // const/4 v2, 0x0
/* move v14, v2 */
/* move v2, v3 */
/* move v3, v4 */
} // :goto_2
v4 = /* invoke-virtual/range {v17 ..v17}, Ljava/lang/String;->length()I */
/* if-lt v14, v4, :cond_1 */
/* move v4, v3 */
/* move v3, v2 */
} // :cond_1
/* move-object/from16 v0, v17 */
v4 = (( java.lang.String ) v0 ).charAt ( v14 ); // invoke-virtual {v0, v14}, Ljava/lang/String;->charAt(I)C
/* const/16 v5, 0xd */
/* if-eq v4, v5, :cond_4 */
/* const/16 v5, 0xa */
/* if-eq v4, v5, :cond_4 */
/* const/16 v5, 0x20 */
/* if-eq v4, v5, :cond_4 */
/* sparse-switch v4, :sswitch_data_0 */
/* aput-char v4, v18, v3 */
/* add-int/lit8 v3, v3, 0x1 */
/* move v4, v3 */
/* move v3, v2 */
} // :goto_3
/* add-int/lit8 v2, v14, 0x1 */
/* move v14, v2 */
/* move v2, v3 */
/* move v3, v4 */
/* :sswitch_0 */
int v3 = 0; // const/4 v3, 0x0
/* invoke-static/range {v18 ..v18}, Ljava/lang/String;->valueOf([C)Ljava/lang/String; */
/* move-object/from16 v0, p0 */
v4 = (( com.a.d.c ) v0 ).c ( v4 ); // invoke-virtual {v0, v4}, Lcom/a/d/c;->c(Ljava/lang/String;)I
/* aput v4, v19, v2 */
/* add-int/lit8 v2, v2, 0x1 */
/* const/16 v4, 0x20 */
/* move-object/from16 v0, v18 */
java.util.Arrays .fill ( v0,v4 );
/* move v4, v3 */
/* move v3, v2 */
/* :sswitch_1 */
/* add-int/lit8 v3, v3, 0x1 */
/* move-object/from16 v0, p0 */
/* iget v3, v0, Lcom/a/d/c;->e:I */
/* const/16 v4, 0x19 */
/* if-ge v3, v4, :cond_2 */
/* move-object/from16 v0, p0 */
/* iget v3, v0, Lcom/a/d/c;->e:I */
/* add-int/lit8 v3, v3, 0x1 */
/* move-object/from16 v0, p0 */
/* iput v3, v0, Lcom/a/d/c;->e:I */
} // :goto_4
int v15 = 0; // const/4 v15, 0x0
/* invoke-static/range {v18 ..v18}, Ljava/lang/String;->valueOf([C)Ljava/lang/String; */
/* move-object/from16 v0, p0 */
v3 = (( com.a.d.c ) v0 ).c ( v3 ); // invoke-virtual {v0, v3}, Lcom/a/d/c;->c(Ljava/lang/String;)I
/* aput v3, v19, v2 */
/* const/16 v2, 0x20 */
/* move-object/from16 v0, v18 */
java.util.Arrays .fill ( v0,v2 );
/* new-instance v2, Lcom/a/c/l; */
/* move-object/from16 v0, p0 */
v3 = this.f;
int v4 = 0; // const/4 v4, 0x0
/* aget v4, v19, v4 */
int v5 = 1; // const/4 v5, 0x1
/* aget v5, v19, v5 */
int v6 = 2; // const/4 v6, 0x2
/* aget v6, v19, v6 */
/* add-int/lit8 v6, v6, -0x1 */
int v7 = 3; // const/4 v7, 0x3
/* aget v7, v19, v7 */
/* add-int/lit8 v7, v7, -0x1 */
int v8 = 4; // const/4 v8, 0x4
/* aget v8, v19, v8 */
int v9 = 5; // const/4 v9, 0x5
/* aget v9, v19, v9 */
int v10 = 6; // const/4 v10, 0x6
/* aget v10, v19, v10 */
int v11 = 7; // const/4 v11, 0x7
/* aget v11, v19, v11 */
/* const/16 v12, 0x8 */
/* aget v12, v19, v12 */
/* move-object/from16 v0, p0 */
/* iget v13, v0, Lcom/a/d/c;->e:I */
/* invoke-direct/range {v2 ..v13}, Lcom/a/c/l;-><init>(Lcom/a/a/a;IIIIIIIIII)V */
/* move-object/from16 v0, v16 */
(( java.util.ArrayList ) v0 ).add ( v2 ); // invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
int v2 = 0; // const/4 v2, 0x0
int v3 = 0; // const/4 v3, 0x0
com.a.c.j.aa = (v3!= 0);
/* move v3, v2 */
/* move v4, v15 */
/* goto/16 :goto_3 */
} // :cond_2
/* const/16 v3, 0x19 */
/* move-object/from16 v0, p0 */
/* iput v3, v0, Lcom/a/d/c;->e:I */
/* :sswitch_2 */
/* move-object/from16 v0, p0 */
/* iget v3, v0, Lcom/a/d/c;->e:I */
/* const/16 v4, 0x19 */
/* if-ge v3, v4, :cond_3 */
/* move-object/from16 v0, p0 */
/* iget v3, v0, Lcom/a/d/c;->e:I */
/* add-int/lit8 v3, v3, 0x1 */
/* move-object/from16 v0, p0 */
/* iput v3, v0, Lcom/a/d/c;->e:I */
} // :goto_5
/* invoke-static/range {v18 ..v18}, Ljava/lang/String;->valueOf([C)Ljava/lang/String; */
/* move-object/from16 v0, p0 */
v3 = (( com.a.d.c ) v0 ).c ( v3 ); // invoke-virtual {v0, v3}, Lcom/a/d/c;->c(Ljava/lang/String;)I
/* aput v3, v19, v2 */
/* const/16 v2, 0x20 */
/* move-object/from16 v0, v18 */
java.util.Arrays .fill ( v0,v2 );
/* new-instance v2, Lcom/a/c/l; */
/* move-object/from16 v0, p0 */
v3 = this.f;
int v4 = 0; // const/4 v4, 0x0
/* aget v4, v19, v4 */
int v5 = 1; // const/4 v5, 0x1
/* aget v5, v19, v5 */
int v6 = 2; // const/4 v6, 0x2
/* aget v6, v19, v6 */
/* add-int/lit8 v6, v6, -0x1 */
int v7 = 3; // const/4 v7, 0x3
/* aget v7, v19, v7 */
/* add-int/lit8 v7, v7, -0x1 */
int v8 = 4; // const/4 v8, 0x4
/* aget v8, v19, v8 */
int v9 = 5; // const/4 v9, 0x5
/* aget v9, v19, v9 */
int v10 = 6; // const/4 v10, 0x6
/* aget v10, v19, v10 */
int v11 = 7; // const/4 v11, 0x7
/* aget v11, v19, v11 */
/* const/16 v12, 0x8 */
/* aget v12, v19, v12 */
/* move-object/from16 v0, p0 */
/* iget v13, v0, Lcom/a/d/c;->e:I */
/* invoke-direct/range {v2 ..v13}, Lcom/a/c/l;-><init>(Lcom/a/a/a;IIIIIIIIII)V */
/* move-object/from16 v0, v16 */
(( java.util.ArrayList ) v0 ).add ( v2 ); // invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
int v2 = 1; // const/4 v2, 0x1
com.a.c.j.aa = (v2!= 0);
/* move-object/from16 v2, v16 */
/* goto/16 :goto_1 */
} // :cond_3
/* const/16 v3, 0x19 */
/* move-object/from16 v0, p0 */
/* iput v3, v0, Lcom/a/d/c;->e:I */
} // :cond_4
/* move v4, v3 */
/* move v3, v2 */
/* goto/16 :goto_3 */
/* :sswitch_data_0 */
/* .sparse-switch */
/* 0x2c -> :sswitch_0 */
/* 0x3b -> :sswitch_2 */
/* 0x7c -> :sswitch_1 */
} // .end sparse-switch
} // .end method
public Integer c ( java.lang.String p0 ) {
/* .locals 1 */
(( java.lang.String ) p1 ).trim ( ); // invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;
v0 = java.lang.Integer .parseInt ( v0 );
} // .end method
