public class net.chobin.android.psdxylz.app.al {
	 /* # instance fields */
	 private android.content.Context a;
	 private a;
	 /* # direct methods */
	 public net.chobin.android.psdxylz.app.al ( ) {
		 /* .locals 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 this.a = p1;
		 int v0 = 0; // const/4 v0, 0x0
		 this.a = v0;
		 return;
	 } // .end method
	 private static Integer a ( Object[] p0, Integer p1 ) {
		 /* .locals 2 */
		 /* aget-byte v0, p0, p1 */
		 /* and-int/lit16 v0, v0, 0xff */
		 /* shl-int/lit8 v0, v0, 0x18 */
		 /* add-int/lit8 v1, p1, 0x1 */
		 /* aget-byte v1, p0, v1 */
		 /* and-int/lit16 v1, v1, 0xff */
		 /* shl-int/lit8 v1, v1, 0x10 */
		 /* or-int/2addr v0, v1 */
		 /* add-int/lit8 v1, p1, 0x2 */
		 /* aget-byte v1, p0, v1 */
		 /* and-int/lit16 v1, v1, 0xff */
		 /* shl-int/lit8 v1, v1, 0x8 */
		 /* or-int/2addr v0, v1 */
		 /* add-int/lit8 v1, p1, 0x3 */
		 /* aget-byte v1, p0, v1 */
		 /* and-int/lit16 v1, v1, 0xff */
		 /* or-int/2addr v0, v1 */
	 } // .end method
	 private static a ( Integer p0 ) {
		 /* .locals 3 */
		 int v0 = 4; // const/4 v0, 0x4
		 /* new-array v0, v0, [B */
		 int v1 = 0; // const/4 v1, 0x0
		 /* shr-int/lit8 v2, p0, 0x18 */
		 /* and-int/lit16 v2, v2, 0xff */
		 /* int-to-byte v2, v2 */
		 /* aput-byte v2, v0, v1 */
		 int v1 = 1; // const/4 v1, 0x1
		 /* shr-int/lit8 v2, p0, 0x10 */
		 /* and-int/lit16 v2, v2, 0xff */
		 /* int-to-byte v2, v2 */
		 /* aput-byte v2, v0, v1 */
		 int v1 = 2; // const/4 v1, 0x2
		 /* shr-int/lit8 v2, p0, 0x8 */
		 /* and-int/lit16 v2, v2, 0xff */
		 /* int-to-byte v2, v2 */
		 /* aput-byte v2, v0, v1 */
		 int v1 = 3; // const/4 v1, 0x3
		 /* and-int/lit16 v2, p0, 0xff */
		 /* int-to-byte v2, v2 */
		 /* aput-byte v2, v0, v1 */
	 } // .end method
	 private Integer c ( Integer p0, Integer p1 ) {
		 /* .locals 3 */
		 int v2 = 2; // const/4 v2, 0x2
		 int v1 = -1; // const/4 v1, -0x1
		 int v0 = 0; // const/4 v0, 0x0
		 v0 = 		 (( net.chobin.android.psdxylz.app.al ) p0 ).b ( v0, p1 ); // invoke-virtual {p0, v0, p1}, Lnet/chobin/android/psdxylz/app/al;->b(II)I
		 /* if-ne v0, v1, :cond_0 */
		 /* new-instance v0, Lnet/chobin/android/psdxylz/app/ah; */
		 /* invoke-direct {v0, v2}, Lnet/chobin/android/psdxylz/app/ah;-><init>(I)V */
		 /* throw v0 */
	 } // :cond_0
	 /* add-int/lit8 v0, v0, 0x4 */
	 v0 = 	 (( net.chobin.android.psdxylz.app.al ) p0 ).b ( v0, p2 ); // invoke-virtual {p0, v0, p2}, Lnet/chobin/android/psdxylz/app/al;->b(II)I
	 /* if-ne v0, v1, :cond_1 */
	 /* new-instance v0, Lnet/chobin/android/psdxylz/app/ah; */
	 /* invoke-direct {v0, v2}, Lnet/chobin/android/psdxylz/app/ah;-><init>(I)V */
	 /* throw v0 */
} // :cond_1
} // .end method
/* # virtual methods */
public Integer a ( Integer p0 ) {
/* .locals 3 */
int v0 = 4; // const/4 v0, 0x4
try { // :try_start_0
	 (( net.chobin.android.psdxylz.app.al ) p0 ).b ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Lnet/chobin/android/psdxylz/app/al;->b(II)[B
	 int v1 = 0; // const/4 v1, 0x0
	 net.chobin.android.psdxylz.app.al .a ( v0,v1 );
	 /* :try_end_0 */
	 v0 = 	 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
	 /* :catch_0 */
	 /* move-exception v0 */
	 /* new-instance v1, Lnet/chobin/android/psdxylz/app/ah; */
	 int v2 = 2; // const/4 v2, 0x2
	 /* invoke-direct {v1, v0, v2}, Lnet/chobin/android/psdxylz/app/ah;-><init>(Ljava/lang/Throwable;I)V */
	 /* throw v1 */
} // .end method
public Integer a ( Integer p0, Integer p1 ) {
	 /* .locals 2 */
	 (( net.chobin.android.psdxylz.app.al ) p0 ).a ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Lnet/chobin/android/psdxylz/app/al;->a(II)[B
	 int v1 = 0; // const/4 v1, 0x0
	 v0 = 	 net.chobin.android.psdxylz.app.al .a ( v0,v1 );
} // .end method
public java.lang.String a ( Integer p0, Integer p1 ) {
	 /* .locals 2 */
	 /* new-instance v0, Ljava/lang/String; */
	 (( net.chobin.android.psdxylz.app.al ) p0 ).a ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Lnet/chobin/android/psdxylz/app/al;->a(II)[B
	 /* invoke-direct {v0, v1}, Ljava/lang/String;-><init>([B)V */
} // .end method
public void a ( ) {
	 /* .locals 5 */
	 v0 = this.a;
	 final String v1 = "sp.data"; // const-string v1, "sp.data"
	 v0 = 	 net.chobin.android.psdxylz.app.e .a ( v0,v1 );
	 if ( v0 != null) { // if-eqz v0, :cond_1
	 } // :cond_0
} // :goto_0
return;
} // :cond_1
/* new-instance v1, Ljava/io/ByteArrayOutputStream; */
/* invoke-direct {v1}, Ljava/io/ByteArrayOutputStream;-><init>()V */
int v0 = 0; // const/4 v0, 0x0
} // :goto_1
try { // :try_start_0
v2 = this.a;
/* new-instance v3, Ljava/lang/StringBuilder; */
/* invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v3 ).append ( v0 ); // invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v4 = ".dat"; // const-string v4, ".dat"
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
net.chobin.android.psdxylz.app.aj .a ( v2,v3 );
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
try { // :try_start_1
(( java.io.ByteArrayOutputStream ) v1 ).write ( v2 ); // invoke-virtual {v1, v2}, Ljava/io/ByteArrayOutputStream;->write([B)V
/* add-int/lit8 v0, v0, 0x1 */
/* :catch_0 */
/* move-exception v0 */
v0 = this.a;
(( java.io.ByteArrayOutputStream ) v1 ).toByteArray ( ); // invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
final String v3 = "sp.data"; // const-string v3, "sp.data"
net.chobin.android.psdxylz.app.e .a ( v0,v2,v3 );
/* :try_end_1 */
/* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_2 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
if ( v1 != null) { // if-eqz v1, :cond_0
	 try { // :try_start_2
		 (( java.io.ByteArrayOutputStream ) v1 ).close ( ); // invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->close()V
		 /* :try_end_2 */
		 /* .catch Ljava/lang/Exception; {:try_start_2 ..:try_end_2} :catch_1 */
		 /* :catch_1 */
		 /* move-exception v0 */
		 /* :catch_2 */
		 /* move-exception v0 */
		 try { // :try_start_3
			 /* new-instance v2, Lnet/chobin/android/psdxylz/app/ah; */
			 int v3 = 3; // const/4 v3, 0x3
			 /* invoke-direct {v2, v0, v3}, Lnet/chobin/android/psdxylz/app/ah;-><init>(Ljava/lang/Throwable;I)V */
			 /* throw v2 */
			 /* :try_end_3 */
			 /* .catchall {:try_start_3 ..:try_end_3} :catchall_0 */
			 /* :catchall_0 */
			 /* move-exception v0 */
			 if ( v1 != null) { // if-eqz v1, :cond_2
				 try { // :try_start_4
					 (( java.io.ByteArrayOutputStream ) v1 ).close ( ); // invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->close()V
					 /* :try_end_4 */
					 /* .catch Ljava/lang/Exception; {:try_start_4 ..:try_end_4} :catch_3 */
				 } // :cond_2
			 } // :goto_2
			 /* throw v0 */
			 /* :catch_3 */
			 /* move-exception v1 */
		 } // .end method
		 public void a ( Integer p0, Integer p1, Integer p2 ) {
			 /* .locals 1 */
			 net.chobin.android.psdxylz.app.al .a ( p3 );
			 (( net.chobin.android.psdxylz.app.al ) p0 ).a ( p1, p2, v0 ); // invoke-virtual {p0, p1, p2, v0}, Lnet/chobin/android/psdxylz/app/al;->a(II[B)V
			 return;
		 } // .end method
		 public void a ( Integer p0, Integer p1, Boolean p2 ) {
			 /* .locals 3 */
			 int v0 = 1; // const/4 v0, 0x1
			 int v1 = 0; // const/4 v1, 0x0
			 /* new-array v2, v0, [B */
			 if ( p3 != null) { // if-eqz p3, :cond_0
			 } // :goto_0
			 /* int-to-byte v0, v0 */
			 /* aput-byte v0, v2, v1 */
			 (( net.chobin.android.psdxylz.app.al ) p0 ).a ( p1, p2, v2 ); // invoke-virtual {p0, p1, p2, v2}, Lnet/chobin/android/psdxylz/app/al;->a(II[B)V
			 return;
		 } // :cond_0
		 /* move v0, v1 */
	 } // .end method
	 public void a ( Integer p0, Integer p1, Object[] p2 ) {
		 /* .locals 5 */
		 try { // :try_start_0
			 v1 = 			 /* invoke-direct {p0, p1, p2}, Lnet/chobin/android/psdxylz/app/al;->c(II)I */
			 v0 = 			 (( net.chobin.android.psdxylz.app.al ) p0 ).a ( v1 ); // invoke-virtual {p0, v1}, Lnet/chobin/android/psdxylz/app/al;->a(I)I
			 /* new-array v2, v0, [B */
			 /* array-length v0, p3 */
			 /* array-length v3, v2 */
			 /* if-le v0, v3, :cond_0 */
			 /* array-length v0, v2 */
		 } // :goto_0
		 int v3 = 0; // const/4 v3, 0x0
		 int v4 = 0; // const/4 v4, 0x0
		 java.lang.System .arraycopy ( p3,v3,v2,v4,v0 );
		 /* add-int/lit8 v0, v1, 0x4 */
		 (( net.chobin.android.psdxylz.app.al ) p0 ).a ( v0, v2 ); // invoke-virtual {p0, v0, v2}, Lnet/chobin/android/psdxylz/app/al;->a(I[B)V
		 return;
	 } // :cond_0
	 /* array-length v0, p3 */
	 /* :try_end_0 */
	 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
	 /* :catch_0 */
	 /* move-exception v0 */
	 /* new-instance v1, Lnet/chobin/android/psdxylz/app/ah; */
	 int v2 = 3; // const/4 v2, 0x3
	 /* invoke-direct {v1, v0, v2}, Lnet/chobin/android/psdxylz/app/ah;-><init>(Ljava/lang/Throwable;I)V */
	 (( net.chobin.android.psdxylz.app.ah ) v1 ).a ( p1 ); // invoke-virtual {v1, p1}, Lnet/chobin/android/psdxylz/app/ah;->a(I)V
	 (( net.chobin.android.psdxylz.app.ah ) v1 ).a ( p2 ); // invoke-virtual {v1, p2}, Lnet/chobin/android/psdxylz/app/ah;->a(I)V
	 /* throw v1 */
} // .end method
public void a ( Integer p0, Object[] p1 ) {
	 /* .locals 3 */
	 try { // :try_start_0
		 v0 = 		 (( net.chobin.android.psdxylz.app.al ) p0 ).a ( ); // invoke-virtual {p0}, Lnet/chobin/android/psdxylz/app/al;->a()Z
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 int v0 = 0; // const/4 v0, 0x0
			 v1 = this.a;
			 /* array-length v2, p2 */
			 java.lang.System .arraycopy ( p2,v0,v1,p1,v2 );
			 v0 = this.a;
			 v1 = this.a;
			 final String v2 = "sp.data"; // const-string v2, "sp.data"
			 net.chobin.android.psdxylz.app.e .a ( v0,v1,v2 );
		 } // :goto_0
		 return;
	 } // :cond_0
	 v0 = this.a;
	 final String v1 = "sp.data"; // const-string v1, "sp.data"
	 net.chobin.android.psdxylz.app.e .a ( v0,p1,p2,v1 );
	 /* :try_end_0 */
	 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
	 /* :catch_0 */
	 /* move-exception v0 */
	 /* new-instance v1, Lnet/chobin/android/psdxylz/app/ah; */
	 int v2 = 3; // const/4 v2, 0x3
	 /* invoke-direct {v1, v0, v2}, Lnet/chobin/android/psdxylz/app/ah;-><init>(Ljava/lang/Throwable;I)V */
	 /* throw v1 */
} // .end method
public Boolean a ( ) {
	 /* .locals 1 */
	 v0 = this.a;
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 int v0 = 1; // const/4 v0, 0x1
	 } // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public Boolean a ( Integer p0, Integer p1 ) {
/* .locals 3 */
int v0 = 1; // const/4 v0, 0x1
int v1 = 0; // const/4 v1, 0x0
(( net.chobin.android.psdxylz.app.al ) p0 ).a ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Lnet/chobin/android/psdxylz/app/al;->a(II)[B
/* aget-byte v2, v2, v1 */
/* if-ne v2, v0, :cond_0 */
} // :goto_0
} // :cond_0
/* move v0, v1 */
} // .end method
public Boolean a ( java.lang.String p0 ) {
/* .locals 2 */
int v0 = 0; // const/4 v0, 0x0
(( net.chobin.android.psdxylz.app.al ) p0 ).a ( v0, v0 ); // invoke-virtual {p0, v0, v0}, Lnet/chobin/android/psdxylz/app/al;->a(II)Ljava/lang/String;
(( java.lang.String ) v1 ).trim ( ); // invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;
v1 = (( java.lang.String ) p1 ).compareTo ( v1 ); // invoke-virtual {p1, v1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I
/* if-nez v1, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
} // .end method
public a ( Integer p0, Integer p1 ) {
/* .locals 3 */
int v0 = 0; // const/4 v0, 0x0
/* check-cast v0, [B */
try { // :try_start_0
v0 = /* invoke-direct {p0, p1, p2}, Lnet/chobin/android/psdxylz/app/al;->c(II)I */
/* add-int/lit8 v1, v0, 0x4 */
v0 = (( net.chobin.android.psdxylz.app.al ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lnet/chobin/android/psdxylz/app/al;->a(I)I
(( net.chobin.android.psdxylz.app.al ) p0 ).b ( v1, v0 ); // invoke-virtual {p0, v1, v0}, Lnet/chobin/android/psdxylz/app/al;->b(II)[B
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception v0 */
/* new-instance v1, Lnet/chobin/android/psdxylz/app/ah; */
int v2 = 2; // const/4 v2, 0x2
/* invoke-direct {v1, v0, v2}, Lnet/chobin/android/psdxylz/app/ah;-><init>(Ljava/lang/Throwable;I)V */
(( net.chobin.android.psdxylz.app.ah ) v1 ).a ( p1 ); // invoke-virtual {v1, p1}, Lnet/chobin/android/psdxylz/app/ah;->a(I)V
(( net.chobin.android.psdxylz.app.ah ) v1 ).a ( p2 ); // invoke-virtual {v1, p2}, Lnet/chobin/android/psdxylz/app/ah;->a(I)V
/* throw v1 */
} // .end method
public Integer b ( Integer p0, Integer p1 ) {
/* .locals 4 */
int v0 = -1; // const/4 v0, -0x1
int v1 = 0; // const/4 v1, 0x0
/* move v2, v1 */
/* move v1, p1 */
} // :goto_0
/* if-lt v2, p2, :cond_1 */
/* move v0, v1 */
} // :cond_0
} // :cond_1
v3 = (( net.chobin.android.psdxylz.app.al ) p0 ).a ( v1 ); // invoke-virtual {p0, v1}, Lnet/chobin/android/psdxylz/app/al;->a(I)I
/* if-eq v3, v0, :cond_0 */
/* add-int/lit8 v3, v3, 0x4 */
/* add-int p1, v1, v3 */
/* add-int/lit8 v1, v2, 0x1 */
/* move v2, v1 */
/* move v1, p1 */
} // .end method
public void b ( ) {
/* .locals 3 */
try { // :try_start_0
v0 = this.a;
final String v1 = "sp.data"; // const-string v1, "sp.data"
net.chobin.android.psdxylz.app.e .a ( v0,v1 );
this.a = v0;
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
return;
/* :catch_0 */
/* move-exception v0 */
/* new-instance v1, Lnet/chobin/android/psdxylz/app/ah; */
int v2 = 2; // const/4 v2, 0x2
/* invoke-direct {v1, v0, v2}, Lnet/chobin/android/psdxylz/app/ah;-><init>(Ljava/lang/Throwable;I)V */
/* throw v1 */
} // .end method
public b ( Integer p0, Integer p1 ) {
/* .locals 4 */
/* new-array v1, p2, [B */
try { // :try_start_0
v0 = (( net.chobin.android.psdxylz.app.al ) p0 ).a ( ); // invoke-virtual {p0}, Lnet/chobin/android/psdxylz/app/al;->a()Z
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.a;
} // :goto_0
int v2 = 0; // const/4 v2, 0x0
/* array-length v3, v1 */
java.lang.System .arraycopy ( v0,p1,v1,v2,v3 );
} // :cond_0
v0 = this.a;
final String v2 = "sp.data"; // const-string v2, "sp.data"
net.chobin.android.psdxylz.app.e .a ( v0,v2 );
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception v0 */
/* new-instance v1, Lnet/chobin/android/psdxylz/app/ah; */
int v2 = 2; // const/4 v2, 0x2
/* invoke-direct {v1, v0, v2}, Lnet/chobin/android/psdxylz/app/ah;-><init>(Ljava/lang/Throwable;I)V */
/* throw v1 */
} // .end method
