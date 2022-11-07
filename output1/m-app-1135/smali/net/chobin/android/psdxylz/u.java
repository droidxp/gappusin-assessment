public class net.chobin.android.psdxylz.u {
	 /* # instance fields */
	 public Integer a;
	 public a;
	 public B a;
	 public Ljava.lang.String a;
	 public Integer b;
	 public b;
	 public c;
	 /* # direct methods */
	 public net.chobin.android.psdxylz.u ( ) {
		 /* .locals 3 */
		 /* const/16 v2, 0x17 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* new-array v0, v2, [B */
		 this.a = v0;
		 int v0 = 2; // const/4 v0, 0x2
		 /* filled-new-array {v2, v0}, [I */
		 /* const-class v1, Ljava/lang/String; */
		 java.lang.reflect.Array .newInstance ( v1,v0 );
		 /* check-cast v0, [[Ljava/lang/String; */
		 this.a = v0;
		 /* new-array v0, v2, [B */
		 this.b = v0;
		 /* new-array v0, v2, [B */
		 this.c = v0;
		 int v0 = 7; // const/4 v0, 0x7
		 /* filled-new-array {v2, v0}, [I */
		 v1 = java.lang.Byte.TYPE;
		 java.lang.reflect.Array .newInstance ( v1,v0 );
		 /* check-cast v0, [[B */
		 this.a = v0;
		 /* iput p1, p0, Lnet/chobin/android/psdxylz/u;->a:I */
		 return;
	 } // .end method
	 public static java.lang.String a ( net.chobin.android.psdxylz.app.al p0, Integer p1, Integer p2, Integer p3 ) {
		 /* .locals 4 */
		 int v0 = 1; // const/4 v0, 0x1
		 (( net.chobin.android.psdxylz.app.al ) p0 ).a ( v0, p1 ); // invoke-virtual {p0, v0, p1}, Lnet/chobin/android/psdxylz/app/al;->a(II)[B
		 /* if-nez p3, :cond_0 */
		 try { // :try_start_0
			 /* new-instance v1, Ljava/lang/String; */
			 /* mul-int/lit8 v2, p2, 0x46 */
			 /* add-int/lit8 v2, v2, 0x48 */
			 /* add-int/lit8 v2, v2, 0x1 */
			 /* const/16 v3, 0x14 */
			 /* invoke-direct {v1, v0, v2, v3}, Ljava/lang/String;-><init>([BII)V */
			 (( java.lang.String ) v1 ).trim ( ); // invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;
		 } // :goto_0
	 } // :cond_0
	 /* new-instance v1, Ljava/lang/String; */
	 /* mul-int/lit8 v2, p2, 0x46 */
	 /* add-int/lit8 v2, v2, 0x48 */
	 /* add-int/lit8 v2, v2, 0x15 */
	 /* const/16 v3, 0x28 */
	 /* invoke-direct {v1, v0, v2, v3}, Ljava/lang/String;-><init>([BII)V */
	 (( java.lang.String ) v1 ).trim ( ); // invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;
	 /* :try_end_0 */
	 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
	 /* :catch_0 */
	 /* move-exception v0 */
	 final String v0 = ""; // const-string v0, ""
} // .end method
public static void a ( net.chobin.android.psdxylz.app.al p0, Integer p1 ) {
	 /* .locals 2 */
	 /* new-instance v0, Lnet/chobin/android/psdxylz/u; */
	 /* invoke-direct {v0, p1}, Lnet/chobin/android/psdxylz/u;-><init>(I)V */
	 int v1 = 0; // const/4 v1, 0x0
	 (( net.chobin.android.psdxylz.u ) v0 ).a ( p0, v1 ); // invoke-virtual {v0, p0, v1}, Lnet/chobin/android/psdxylz/u;->a(Lnet/chobin/android/psdxylz/app/al;Z)V
	 int v1 = 1; // const/4 v1, 0x1
	 (( net.chobin.android.psdxylz.u ) v0 ).b ( p0, v1 ); // invoke-virtual {v0, p0, v1}, Lnet/chobin/android/psdxylz/u;->b(Lnet/chobin/android/psdxylz/app/al;Z)V
	 return;
} // .end method
private void a ( Object[] p0, Integer p1 ) {
	 /* .locals 8 */
	 int v7 = 1; // const/4 v7, 0x1
	 int v6 = 0; // const/4 v6, 0x0
	 /* mul-int/lit8 v0, p2, 0x46 */
	 /* add-int/lit8 v0, v0, 0x48 */
	 v1 = this.a;
	 /* aget-byte v2, p1, v0 */
	 /* aput-byte v2, v1, p2 */
	 try { // :try_start_0
		 v1 = this.a;
		 /* aget-object v1, v1, p2 */
		 int v2 = 0; // const/4 v2, 0x0
		 /* new-instance v3, Ljava/lang/String; */
		 /* add-int/lit8 v4, v0, 0x1 */
		 /* const/16 v5, 0x14 */
		 /* invoke-direct {v3, p1, v4, v5}, Ljava/lang/String;-><init>([BII)V */
		 (( java.lang.String ) v3 ).trim ( ); // invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;
		 /* aput-object v3, v1, v2 */
		 v1 = this.a;
		 /* aget-object v1, v1, p2 */
		 int v2 = 1; // const/4 v2, 0x1
		 /* new-instance v3, Ljava/lang/String; */
		 /* add-int/lit8 v4, v0, 0x15 */
		 /* const/16 v5, 0x28 */
		 /* invoke-direct {v3, p1, v4, v5}, Ljava/lang/String;-><init>([BII)V */
		 (( java.lang.String ) v3 ).trim ( ); // invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;
		 /* aput-object v3, v1, v2 */
		 /* :try_end_0 */
		 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
	 } // :goto_0
	 v1 = this.b;
	 /* add-int/lit8 v2, v0, 0x3d */
	 /* aget-byte v2, p1, v2 */
	 /* aput-byte v2, v1, p2 */
	 v1 = this.c;
	 /* add-int/lit8 v2, v0, 0x3e */
	 /* aget-byte v2, p1, v2 */
	 /* aput-byte v2, v1, p2 */
	 v1 = this.a;
	 /* aget-object v1, v1, p2 */
	 /* add-int/lit8 v2, v0, 0x3f */
	 /* aget-byte v2, p1, v2 */
	 /* mul-int/lit8 v2, v2, 0xa */
	 /* int-to-byte v2, v2 */
	 /* aput-byte v2, v1, v6 */
	 v1 = this.a;
	 /* aget-object v1, v1, p2 */
	 /* add-int/lit8 v2, v0, 0x40 */
	 /* aget-byte v2, p1, v2 */
	 /* mul-int/lit8 v2, v2, 0xa */
	 /* int-to-byte v2, v2 */
	 /* aput-byte v2, v1, v7 */
	 v1 = this.a;
	 /* aget-object v1, v1, p2 */
	 int v2 = 2; // const/4 v2, 0x2
	 /* add-int/lit8 v3, v0, 0x41 */
	 /* aget-byte v3, p1, v3 */
	 /* mul-int/lit8 v3, v3, 0xa */
	 /* int-to-byte v3, v3 */
	 /* aput-byte v3, v1, v2 */
	 v1 = this.a;
	 /* aget-object v1, v1, p2 */
	 int v2 = 3; // const/4 v2, 0x3
	 /* add-int/lit8 v3, v0, 0x42 */
	 /* aget-byte v3, p1, v3 */
	 /* mul-int/lit8 v3, v3, 0xa */
	 /* int-to-byte v3, v3 */
	 /* aput-byte v3, v1, v2 */
	 v1 = this.a;
	 /* aget-object v1, v1, p2 */
	 int v2 = 4; // const/4 v2, 0x4
	 /* add-int/lit8 v3, v0, 0x43 */
	 /* aget-byte v3, p1, v3 */
	 /* mul-int/lit8 v3, v3, 0xa */
	 /* int-to-byte v3, v3 */
	 /* aput-byte v3, v1, v2 */
	 v1 = this.a;
	 /* aget-object v1, v1, p2 */
	 int v2 = 5; // const/4 v2, 0x5
	 /* add-int/lit8 v3, v0, 0x44 */
	 /* aget-byte v3, p1, v3 */
	 /* mul-int/lit8 v3, v3, 0xa */
	 /* int-to-byte v3, v3 */
	 /* aput-byte v3, v1, v2 */
	 v1 = this.a;
	 /* aget-object v1, v1, p2 */
	 int v2 = 6; // const/4 v2, 0x6
	 /* add-int/lit8 v0, v0, 0x45 */
	 /* aget-byte v0, p1, v0 */
	 /* mul-int/lit8 v0, v0, 0xa */
	 /* int-to-byte v0, v0 */
	 /* aput-byte v0, v1, v2 */
	 return;
	 /* :catch_0 */
	 /* move-exception v1 */
} // .end method
/* # virtual methods */
public Integer a ( Integer p0 ) {
	 /* .locals 3 */
	 int v1 = 0; // const/4 v1, 0x0
	 /* move v0, v1 */
} // :goto_0
/* const/16 v2, 0x17 */
/* if-lt v0, v2, :cond_1 */
/* move v0, v1 */
} // :cond_0
} // :cond_1
v2 = this.c;
/* aget-byte v2, v2, v0 */
/* if-eq v2, p1, :cond_0 */
/* add-int/lit8 v0, v0, 0x1 */
} // .end method
public void a ( android.content.Context p0, net.chobin.android.psdxylz.app.al p1 ) {
/* .locals 3 */
final String v0 = "CN"; // const-string v0, "CN"
/* iget v1, p0, Lnet/chobin/android/psdxylz/u;->a:I */
net.chobin.android.psdxylz.app.aj .a ( p1,v0,v1 );
int v1 = 1; // const/4 v1, 0x1
/* iget v2, p0, Lnet/chobin/android/psdxylz/u;->a:I */
(( net.chobin.android.psdxylz.app.al ) p2 ).a ( v1, v2, v0 ); // invoke-virtual {p2, v1, v2, v0}, Lnet/chobin/android/psdxylz/app/al;->a(II[B)V
int v0 = 0; // const/4 v0, 0x0
/* check-cast v0, [B */
int v0 = 0; // const/4 v0, 0x0
(( net.chobin.android.psdxylz.u ) p0 ).a ( p2, v0 ); // invoke-virtual {p0, p2, v0}, Lnet/chobin/android/psdxylz/u;->a(Lnet/chobin/android/psdxylz/app/al;Z)V
return;
} // .end method
public void a ( net.chobin.android.psdxylz.app.al p0, Boolean p1 ) {
/* .locals 8 */
/* const/16 v7, 0x51 */
/* const/16 v6, 0x17 */
int v0 = 0; // const/4 v0, 0x0
int v1 = 1; // const/4 v1, 0x1
/* iget v2, p0, Lnet/chobin/android/psdxylz/u;->a:I */
(( net.chobin.android.psdxylz.app.al ) p1 ).a ( v1, v2 ); // invoke-virtual {p1, v1, v2}, Lnet/chobin/android/psdxylz/app/al;->a(II)[B
/* const/16 v1, 0x47 */
/* aget-byte v1, v2, v1 */
/* iput v1, p0, Lnet/chobin/android/psdxylz/u;->b:I */
if ( p2 != null) { // if-eqz p2, :cond_0
/* const/16 v1, 0x1f */
(( net.chobin.android.psdxylz.app.al ) p1 ).a ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Lnet/chobin/android/psdxylz/app/al;->a(II)[B
/* move v1, v0 */
} // :goto_0
/* if-lt v1, v6, :cond_1 */
/* const/16 v1, 0x20 */
(( net.chobin.android.psdxylz.app.al ) p1 ).a ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Lnet/chobin/android/psdxylz/app/al;->a(II)[B
/* const/16 v3, 0x692 */
java.lang.System .arraycopy ( v1,v0,v2,v3,v7 );
} // :cond_0
/* move v1, v0 */
} // :goto_1
/* if-lt v1, v6, :cond_2 */
} // :goto_2
/* if-lt v0, v7, :cond_3 */
int v0 = 0; // const/4 v0, 0x0
/* check-cast v0, [B */
return;
} // :cond_1
/* mul-int/lit8 v4, v1, 0x46 */
/* add-int/lit8 v4, v4, 0x48 */
/* add-int/lit8 v4, v4, 0x3e */
/* aget-byte v5, v3, v1 */
/* aput-byte v5, v2, v4 */
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_2
/* invoke-direct {p0, v2, v1}, Lnet/chobin/android/psdxylz/u;->a([BI)V */
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_3
v1 = net.chobin.android.psdxylz.t.c;
/* iget v3, p0, Lnet/chobin/android/psdxylz/u;->a:I */
/* aget-object v1, v1, v3 */
/* add-int/lit16 v3, v0, 0x692 */
/* aget-byte v3, v2, v3 */
/* aput v3, v1, v0 */
/* add-int/lit8 v0, v0, 0x1 */
} // .end method
public void b ( net.chobin.android.psdxylz.app.al p0, Boolean p1 ) {
/* .locals 12 */
int v1 = 0; // const/4 v1, 0x0
/* const/16 v11, 0x51 */
/* const/16 v10, 0x17 */
int v9 = 1; // const/4 v9, 0x1
int v2 = 0; // const/4 v2, 0x0
if ( p2 != null) { // if-eqz p2, :cond_2
/* new-array v1, v10, [B */
/* move v0, v2 */
} // :goto_0
/* array-length v3, v1 */
/* if-lt v0, v3, :cond_0 */
/* const/16 v0, 0x1f */
(( net.chobin.android.psdxylz.app.al ) p1 ).a ( v2, v0, v1 ); // invoke-virtual {p1, v2, v0, v1}, Lnet/chobin/android/psdxylz/app/al;->a(II[B)V
/* new-array v1, v11, [B */
/* move v0, v2 */
} // :goto_1
/* array-length v3, v1 */
/* if-lt v0, v3, :cond_1 */
/* const/16 v0, 0x20 */
(( net.chobin.android.psdxylz.app.al ) p1 ).a ( v2, v0, v1 ); // invoke-virtual {p1, v2, v0, v1}, Lnet/chobin/android/psdxylz/app/al;->a(II[B)V
} // :goto_2
return;
} // :cond_0
v3 = this.c;
/* aget-byte v3, v3, v0 */
/* aput-byte v3, v1, v0 */
/* add-int/lit8 v0, v0, 0x1 */
} // :cond_1
v3 = net.chobin.android.psdxylz.t.c;
/* iget v4, p0, Lnet/chobin/android/psdxylz/u;->a:I */
/* aget-object v3, v3, v4 */
/* aget v3, v3, v0 */
/* int-to-byte v3, v3 */
/* aput-byte v3, v1, v0 */
/* add-int/lit8 v0, v0, 0x1 */
} // :cond_2
/* iget v0, p0, Lnet/chobin/android/psdxylz/u;->a:I */
(( net.chobin.android.psdxylz.app.al ) p1 ).a ( v9, v0 ); // invoke-virtual {p1, v9, v0}, Lnet/chobin/android/psdxylz/app/al;->a(II)[B
/* const/16 v3, 0x6e3 */
/* new-array v3, v3, [B */
/* const/16 v4, 0x47 */
/* iget v5, p0, Lnet/chobin/android/psdxylz/u;->b:I */
/* int-to-byte v5, v5 */
/* aput-byte v5, v0, v4 */
/* const/16 v4, 0x48 */
java.lang.System .arraycopy ( v0,v2,v3,v2,v4 );
/* move-object v0, v1 */
/* check-cast v0, [B */
/* move v0, v2 */
} // :goto_3
/* if-lt v0, v10, :cond_3 */
} // :goto_4
/* if-lt v2, v11, :cond_4 */
/* iget v0, p0, Lnet/chobin/android/psdxylz/u;->a:I */
(( net.chobin.android.psdxylz.app.al ) p1 ).a ( v9, v0, v3 ); // invoke-virtual {p1, v9, v0, v3}, Lnet/chobin/android/psdxylz/app/al;->a(II[B)V
/* check-cast v1, [B */
} // :cond_3
/* mul-int/lit8 v4, v0, 0x46 */
/* add-int/lit8 v4, v4, 0x48 */
v5 = this.a;
/* aget-byte v5, v5, v0 */
/* aput-byte v5, v3, v4 */
try { // :try_start_0
v5 = this.a;
/* aget-object v5, v5, v0 */
int v6 = 0; // const/4 v6, 0x0
/* aget-object v5, v5, v6 */
final String v6 = "UTF-8"; // const-string v6, "UTF-8"
(( java.lang.String ) v5 ).getBytes ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B
int v6 = 0; // const/4 v6, 0x0
/* add-int/lit8 v7, v4, 0x1 */
/* array-length v8, v5 */
java.lang.System .arraycopy ( v5,v6,v3,v7,v8 );
v5 = this.a;
/* aget-object v5, v5, v0 */
int v6 = 1; // const/4 v6, 0x1
/* aget-object v5, v5, v6 */
final String v6 = "UTF-8"; // const-string v6, "UTF-8"
(( java.lang.String ) v5 ).getBytes ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B
int v6 = 0; // const/4 v6, 0x0
/* add-int/lit8 v7, v4, 0x15 */
/* array-length v8, v5 */
java.lang.System .arraycopy ( v5,v6,v3,v7,v8 );
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
} // :goto_5
/* add-int/lit8 v5, v4, 0x3d */
v6 = this.b;
/* aget-byte v6, v6, v0 */
/* aput-byte v6, v3, v5 */
/* add-int/lit8 v5, v4, 0x3e */
v6 = this.c;
/* aget-byte v6, v6, v0 */
/* aput-byte v6, v3, v5 */
/* add-int/lit8 v5, v4, 0x3f */
v6 = this.a;
/* aget-object v6, v6, v0 */
/* aget-byte v6, v6, v2 */
/* div-int/lit8 v6, v6, 0xa */
/* int-to-byte v6, v6 */
/* aput-byte v6, v3, v5 */
/* add-int/lit8 v5, v4, 0x40 */
v6 = this.a;
/* aget-object v6, v6, v0 */
/* aget-byte v6, v6, v9 */
/* div-int/lit8 v6, v6, 0xa */
/* int-to-byte v6, v6 */
/* aput-byte v6, v3, v5 */
/* add-int/lit8 v5, v4, 0x41 */
v6 = this.a;
/* aget-object v6, v6, v0 */
int v7 = 2; // const/4 v7, 0x2
/* aget-byte v6, v6, v7 */
/* div-int/lit8 v6, v6, 0xa */
/* int-to-byte v6, v6 */
/* aput-byte v6, v3, v5 */
/* add-int/lit8 v5, v4, 0x42 */
v6 = this.a;
/* aget-object v6, v6, v0 */
int v7 = 3; // const/4 v7, 0x3
/* aget-byte v6, v6, v7 */
/* div-int/lit8 v6, v6, 0xa */
/* int-to-byte v6, v6 */
/* aput-byte v6, v3, v5 */
/* add-int/lit8 v5, v4, 0x43 */
v6 = this.a;
/* aget-object v6, v6, v0 */
int v7 = 4; // const/4 v7, 0x4
/* aget-byte v6, v6, v7 */
/* div-int/lit8 v6, v6, 0xa */
/* int-to-byte v6, v6 */
/* aput-byte v6, v3, v5 */
/* add-int/lit8 v5, v4, 0x44 */
v6 = this.a;
/* aget-object v6, v6, v0 */
int v7 = 5; // const/4 v7, 0x5
/* aget-byte v6, v6, v7 */
/* div-int/lit8 v6, v6, 0xa */
/* int-to-byte v6, v6 */
/* aput-byte v6, v3, v5 */
/* add-int/lit8 v4, v4, 0x45 */
v5 = this.a;
/* aget-object v5, v5, v0 */
int v6 = 6; // const/4 v6, 0x6
/* aget-byte v5, v5, v6 */
/* div-int/lit8 v5, v5, 0xa */
/* int-to-byte v5, v5 */
/* aput-byte v5, v3, v4 */
/* add-int/lit8 v0, v0, 0x1 */
/* goto/16 :goto_3 */
} // :cond_4
/* add-int/lit16 v0, v2, 0x692 */
v4 = net.chobin.android.psdxylz.t.c;
/* iget v5, p0, Lnet/chobin/android/psdxylz/u;->a:I */
/* aget-object v4, v4, v5 */
/* aget v4, v4, v2 */
/* int-to-byte v4, v4 */
/* aput-byte v4, v3, v0 */
/* add-int/lit8 v2, v2, 0x1 */
/* goto/16 :goto_4 */
/* :catch_0 */
/* move-exception v5 */
/* goto/16 :goto_5 */
} // .end method
