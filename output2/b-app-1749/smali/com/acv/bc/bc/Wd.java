public class com.acv.bc.bc.Wd {
	 /* # static fields */
	 public static final java.lang.String c;
	 /* # instance fields */
	 private Integer a;
	 private Integer b;
	 java.lang.String d;
	 java.lang.String e;
	 java.lang.String f;
	 java.lang.String g;
	 private java.lang.String h;
	 private Integer i;
	 private java.lang.String j;
	 private Long k;
	 private Long l;
	 private Long m;
	 private android.content.Context n;
	 /* # direct methods */
	 static com.acv.bc.bc.Wd ( ) {
		 /* .locals 1 */
		 /* const-class v0, Lcom/acv/bc/bc/Wd; */
		 (( java.lang.Class ) v0 ).getSimpleName ( ); // invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
		 return;
	 } // .end method
	 public com.acv.bc.bc.Wd ( ) {
		 /* .locals 4 */
		 /* const/16 v3, 0xc */
		 /* const-wide/16 v1, 0x0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 int v0 = -1; // const/4 v0, -0x1
		 /* iput v0, p0, Lcom/acv/bc/bc/Wd;->b:I */
		 int v0 = 0; // const/4 v0, 0x0
		 /* iput v0, p0, Lcom/acv/bc/bc/Wd;->i:I */
		 /* iput-wide v1, p0, Lcom/acv/bc/bc/Wd;->k:J */
		 /* iput-wide v1, p0, Lcom/acv/bc/bc/Wd;->l:J */
		 /* iput-wide v1, p0, Lcom/acv/bc/bc/Wd;->m:J */
		 /* new-instance v0, Ljava/lang/String; */
		 int v1 = 3; // const/4 v1, 0x3
		 /* new-array v1, v1, [C */
		 /* fill-array-data v1, :array_0 */
		 /* invoke-direct {v0, v1}, Ljava/lang/String;-><init>([C)V */
		 this.d = v0;
		 /* new-instance v0, Ljava/lang/String; */
		 /* new-array v1, v3, [C */
		 /* fill-array-data v1, :array_1 */
		 /* invoke-direct {v0, v1}, Ljava/lang/String;-><init>([C)V */
		 this.e = v0;
		 /* new-instance v0, Ljava/lang/String; */
		 /* new-array v1, v3, [C */
		 /* fill-array-data v1, :array_2 */
		 /* invoke-direct {v0, v1}, Ljava/lang/String;-><init>([C)V */
		 this.f = v0;
		 /* new-instance v0, Ljava/lang/String; */
		 /* const/16 v1, 0x8 */
		 /* new-array v1, v1, [C */
		 /* fill-array-data v1, :array_3 */
		 /* invoke-direct {v0, v1}, Ljava/lang/String;-><init>([C)V */
		 this.g = v0;
		 int v0 = 2; // const/4 v0, 0x2
		 /* iput v0, p0, Lcom/acv/bc/bc/Wd;->a:I */
		 this.n = p1;
		 /* invoke-direct {p0, p1}, Lcom/acv/bc/bc/Wd;->a(Landroid/content/Context;)V */
		 return;
		 /* nop */
		 /* :array_0 */
		 /* .array-data 2 */
		 /* 0x75s */
		 /* 0x69s */
		 /* 0x64s */
	 } // .end array-data
	 /* nop */
	 /* :array_1 */
	 /* .array-data 2 */
	 /* 0x72s */
	 /* 0x65s */
	 /* 0x67s */
	 /* 0x69s */
	 /* 0x73s */
	 /* 0x74s */
	 /* 0x65s */
	 /* 0x72s */
	 /* 0x54s */
	 /* 0x69s */
	 /* 0x6ds */
	 /* 0x65s */
} // .end array-data
/* :array_2 */
/* .array-data 2 */
/* 0x69s */
/* 0x6es */
/* 0x74s */
/* 0x65s */
/* 0x72s */
/* 0x76s */
/* 0x61s */
/* 0x6cs */
/* 0x54s */
/* 0x69s */
/* 0x6ds */
/* 0x65s */
} // .end array-data
/* :array_3 */
/* .array-data 2 */
/* 0x6cs */
/* 0x61s */
/* 0x73s */
/* 0x74s */
/* 0x54s */
/* 0x69s */
/* 0x6ds */
/* 0x65s */
} // .end array-data
} // .end method
private void a ( android.content.Context p0 ) {
/* .locals 3 */
try { // :try_start_0
(( android.content.Context ) p1 ).getPackageName ( ); // invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
this.h = v0;
(( android.content.Context ) p1 ).getPackageManager ( ); // invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
v1 = this.h;
int v2 = 0; // const/4 v2, 0x0
(( android.content.pm.PackageManager ) v0 ).getPackageInfo ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
/* iget v1, v0, Landroid/content/pm/PackageInfo;->versionCode:I */
/* iput v1, p0, Lcom/acv/bc/bc/Wd;->i:I */
v0 = this.versionName;
this.j = v0;
/* :try_end_0 */
/* .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 ..:try_end_0} :catch_0 */
} // :goto_0
return;
/* :catch_0 */
/* move-exception v0 */
v1 = com.acv.bc.bc.Wd.c;
final String v2 = "NameNotFoundException!"; // const-string v2, "NameNotFoundException!"
com.acv.bc.bc.Mk .a ( v1,v2,v0 );
} // .end method
/* # virtual methods */
public void a ( Integer p0 ) {
/* .locals 0 */
/* iput p1, p0, Lcom/acv/bc/bc/Wd;->b:I */
return;
} // .end method
public void a ( Long p0 ) {
/* .locals 0 */
/* iput-wide p1, p0, Lcom/acv/bc/bc/Wd;->k:J */
return;
} // .end method
public void a ( android.content.SharedPreferences p0 ) {
/* .locals 4 */
/* const-wide/16 v2, 0x0 */
v0 = this.d;
v0 = int v1 = -1; // const/4 v1, -0x1
/* iput v0, p0, Lcom/acv/bc/bc/Wd;->b:I */
v0 = this.e;
/* move-result-wide v0 */
/* iput-wide v0, p0, Lcom/acv/bc/bc/Wd;->k:J */
v0 = this.f;
/* move-result-wide v0 */
/* iput-wide v0, p0, Lcom/acv/bc/bc/Wd;->l:J */
v0 = this.g;
/* move-result-wide v0 */
/* iput-wide v0, p0, Lcom/acv/bc/bc/Wd;->m:J */
return;
} // .end method
public void a ( java.io.DataOutputStream p0 ) {
/* .locals 2 */
v0 = com.a.Gb.g;
/* new-instance v1, Ljava/lang/StringBuilder; */
java.lang.String .valueOf ( v0 );
/* invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
final String v0 = " "; // const-string v0, " "
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.d;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = "="; // const-string v1, "="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget v1, p0, Lcom/acv/bc/bc/Wd;->b:I */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* iget v0, p0, Lcom/acv/bc/bc/Wd;->b:I */
(( java.io.DataOutputStream ) p1 ).writeInt ( v0 ); // invoke-virtual {p1, v0}, Ljava/io/DataOutputStream;->writeInt(I)V
/* iget v0, p0, Lcom/acv/bc/bc/Wd;->a:I */
(( java.io.DataOutputStream ) p1 ).writeInt ( v0 ); // invoke-virtual {p1, v0}, Ljava/io/DataOutputStream;->writeInt(I)V
v0 = this.h;
final String v1 = "unknown"; // const-string v1, "unknown"
com.acv.bc.bc.Gg .a ( v0,v1 );
(( java.io.DataOutputStream ) p1 ).writeUTF ( v0 ); // invoke-virtual {p1, v0}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V
/* iget v0, p0, Lcom/acv/bc/bc/Wd;->i:I */
(( java.io.DataOutputStream ) p1 ).writeInt ( v0 ); // invoke-virtual {p1, v0}, Ljava/io/DataOutputStream;->writeInt(I)V
v0 = this.j;
final String v1 = "unknown"; // const-string v1, "unknown"
com.acv.bc.bc.Gg .a ( v0,v1 );
(( java.io.DataOutputStream ) p1 ).writeUTF ( v0 ); // invoke-virtual {p1, v0}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V
/* iget-wide v0, p0, Lcom/acv/bc/bc/Wd;->k:J */
(( java.io.DataOutputStream ) p1 ).writeLong ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Ljava/io/DataOutputStream;->writeLong(J)V
/* iget-wide v0, p0, Lcom/acv/bc/bc/Wd;->l:J */
(( java.io.DataOutputStream ) p1 ).writeLong ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Ljava/io/DataOutputStream;->writeLong(J)V
/* iget-wide v0, p0, Lcom/acv/bc/bc/Wd;->m:J */
(( java.io.DataOutputStream ) p1 ).writeLong ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Ljava/io/DataOutputStream;->writeLong(J)V
return;
} // .end method
public void b ( Long p0 ) {
/* .locals 0 */
/* iput-wide p1, p0, Lcom/acv/bc/bc/Wd;->l:J */
return;
} // .end method
public void b ( android.content.SharedPreferences p0 ) {
/* .locals 4 */
v1 = this.d;
/* iget v2, p0, Lcom/acv/bc/bc/Wd;->b:I */
v1 = this.e;
/* iget-wide v2, p0, Lcom/acv/bc/bc/Wd;->k:J */
v1 = this.f;
/* iget-wide v2, p0, Lcom/acv/bc/bc/Wd;->l:J */
v1 = this.g;
/* iget-wide v2, p0, Lcom/acv/bc/bc/Wd;->m:J */
return;
} // .end method
public void c ( Long p0 ) {
/* .locals 0 */
/* iput-wide p1, p0, Lcom/acv/bc/bc/Wd;->m:J */
return;
} // .end method
public Integer d ( ) {
/* .locals 1 */
/* iget v0, p0, Lcom/acv/bc/bc/Wd;->b:I */
} // .end method
public Long e ( ) {
/* .locals 2 */
/* iget-wide v0, p0, Lcom/acv/bc/bc/Wd;->l:J */
/* return-wide v0 */
} // .end method
public Long f ( ) {
/* .locals 2 */
/* iget-wide v0, p0, Lcom/acv/bc/bc/Wd;->m:J */
/* return-wide v0 */
} // .end method
public java.lang.String toString ( ) {
/* .locals 5 */
/* new-instance v0, Ljava/lang/String; */
/* const/16 v1, 0xa */
/* new-array v1, v1, [C */
/* fill-array-data v1, :array_0 */
/* invoke-direct {v0, v1}, Ljava/lang/String;-><init>([C)V */
/* const/16 v1, 0x8 */
/* new-array v1, v1, [Ljava/lang/Object; */
int v2 = 0; // const/4 v2, 0x0
/* iget v3, p0, Lcom/acv/bc/bc/Wd;->a:I */
java.lang.Integer .valueOf ( v3 );
/* aput-object v3, v1, v2 */
int v2 = 1; // const/4 v2, 0x1
/* iget v3, p0, Lcom/acv/bc/bc/Wd;->b:I */
java.lang.Integer .valueOf ( v3 );
/* aput-object v3, v1, v2 */
int v2 = 2; // const/4 v2, 0x2
v3 = this.h;
/* aput-object v3, v1, v2 */
int v2 = 3; // const/4 v2, 0x3
/* iget v3, p0, Lcom/acv/bc/bc/Wd;->i:I */
java.lang.Integer .valueOf ( v3 );
/* aput-object v3, v1, v2 */
int v2 = 4; // const/4 v2, 0x4
v3 = this.j;
/* aput-object v3, v1, v2 */
int v2 = 5; // const/4 v2, 0x5
/* iget-wide v3, p0, Lcom/acv/bc/bc/Wd;->k:J */
java.lang.Long .valueOf ( v3,v4 );
/* aput-object v3, v1, v2 */
int v2 = 6; // const/4 v2, 0x6
/* iget-wide v3, p0, Lcom/acv/bc/bc/Wd;->l:J */
java.lang.Long .valueOf ( v3,v4 );
/* aput-object v3, v1, v2 */
int v2 = 7; // const/4 v2, 0x7
/* iget-wide v3, p0, Lcom/acv/bc/bc/Wd;->m:J */
java.lang.Long .valueOf ( v3,v4 );
/* aput-object v3, v1, v2 */
com.acv.bc.bc.Gg .a ( v0,v1 );
/* nop */
/* :array_0 */
/* .array-data 2 */
/* 0x50s */
/* 0x72s */
/* 0x6fs */
/* 0x70s */
/* 0x65s */
/* 0x72s */
/* 0x74s */
/* 0x69s */
/* 0x65s */
/* 0x73s */
} // .end array-data
} // .end method
