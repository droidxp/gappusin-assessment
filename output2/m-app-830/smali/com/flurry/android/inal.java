class inal {
	 /* # instance fields */
	 private android.content.Context a;
	 private com.flurry.android.u b;
	 private com.flurry.android.a c;
	 private volatile Long d;
	 private com.flurry.android.af e;
	 private com.flurry.android.af f;
	 private java.util.Map g;
	 private java.util.Map h;
	 private java.util.Map i;
	 private java.util.Map j;
	 private volatile Boolean k;
	 /* # direct methods */
	 inal ( ) {
		 /* .locals 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* new-instance v0, Lcom/flurry/android/af; */
		 /* invoke-direct {v0}, Lcom/flurry/android/af;-><init>()V */
		 this.e = v0;
		 /* new-instance v0, Lcom/flurry/android/af; */
		 /* invoke-direct {v0}, Lcom/flurry/android/af;-><init>()V */
		 this.f = v0;
		 /* new-instance v0, Ljava/util/HashMap; */
		 /* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
		 this.g = v0;
		 /* new-instance v0, Ljava/util/HashMap; */
		 /* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
		 this.h = v0;
		 /* new-instance v0, Ljava/util/HashMap; */
		 /* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
		 this.i = v0;
		 /* new-instance v0, Ljava/util/HashMap; */
		 /* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
		 this.j = v0;
		 return;
	 } // .end method
	 private synchronized com.flurry.android.c a ( Object p0 ) {
		 /* .locals 2 */
		 /* monitor-enter p0 */
		 try { // :try_start_0
			 v0 = this.i;
			 java.lang.Byte .valueOf ( p1 );
			 /* check-cast v0, Lcom/flurry/android/c; */
			 /* :try_end_0 */
			 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
			 /* monitor-exit p0 */
			 /* :catchall_0 */
			 /* move-exception v0 */
			 /* monitor-exit p0 */
			 /* throw v0 */
		 } // .end method
		 private void a ( Integer p0 ) {
			 /* .locals 1 */
			 v0 = 			 v0 = this.g;
			 /* if-nez v0, :cond_1 */
			 int v0 = 1; // const/4 v0, 0x1
		 } // :goto_0
		 /* iput-boolean v0, p0, Lcom/flurry/android/z;->k:Z */
		 /* iget-boolean v0, p0, Lcom/flurry/android/z;->k:Z */
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 v0 = this.b;
			 (( com.flurry.android.u ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lcom/flurry/android/u;->a(I)V
		 } // :cond_0
		 return;
	 } // :cond_1
	 int v0 = 0; // const/4 v0, 0x0
} // .end method
private void a ( java.io.DataInputStream p0 ) {
	 /* .locals 9 */
	 int v7 = 0; // const/4 v7, 0x0
	 final String v8 = "FlurryAgent"; // const-string v8, "FlurryAgent"
	 final String v0 = "FlurryAgent"; // const-string v0, "FlurryAgent"
	 final String v0 = "Reading cache"; // const-string v0, "Reading cache"
	 com.flurry.android.ah .a ( v8,v0 );
	 v0 = 	 (( java.io.DataInputStream ) p1 ).readUnsignedShort ( ); // invoke-virtual {p1}, Ljava/io/DataInputStream;->readUnsignedShort()I
	 int v1 = 2; // const/4 v1, 0x2
	 /* if-eq v0, v1, :cond_0 */
} // :goto_0
return;
} // :cond_0
(( java.io.DataInputStream ) p1 ).readLong ( ); // invoke-virtual {p1}, Ljava/io/DataInputStream;->readLong()J
/* move-result-wide v0 */
/* iput-wide v0, p0, Lcom/flurry/android/z;->d:J */
v0 = (( java.io.DataInputStream ) p1 ).readUnsignedShort ( ); // invoke-virtual {p1}, Ljava/io/DataInputStream;->readUnsignedShort()I
/* new-instance v1, Lcom/flurry/android/af; */
/* invoke-direct {v1}, Lcom/flurry/android/af;-><init>()V */
this.e = v1;
/* move v1, v7 */
} // :goto_1
/* if-ge v1, v0, :cond_1 */
(( java.io.DataInputStream ) p1 ).readLong ( ); // invoke-virtual {p1}, Ljava/io/DataInputStream;->readLong()J
/* move-result-wide v2 */
/* new-instance v4, Lcom/flurry/android/AdImage; */
/* invoke-direct {v4}, Lcom/flurry/android/AdImage;-><init>()V */
(( com.flurry.android.AdImage ) v4 ).a ( p1 ); // invoke-virtual {v4, p1}, Lcom/flurry/android/AdImage;->a(Ljava/io/DataInput;)V
v5 = this.e;
java.lang.Long .valueOf ( v2,v3 );
(( com.flurry.android.af ) v5 ).a ( v2, v4 ); // invoke-virtual {v5, v2, v4}, Lcom/flurry/android/af;->a(Ljava/lang/Object;Ljava/lang/Object;)V
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_1
v0 = (( java.io.DataInputStream ) p1 ).readUnsignedShort ( ); // invoke-virtual {p1}, Ljava/io/DataInputStream;->readUnsignedShort()I
/* new-instance v1, Lcom/flurry/android/af; */
/* invoke-direct {v1}, Lcom/flurry/android/af;-><init>()V */
this.f = v1;
/* move v1, v7 */
} // :goto_2
/* if-ge v1, v0, :cond_4 */
(( java.io.DataInputStream ) p1 ).readLong ( ); // invoke-virtual {p1}, Ljava/io/DataInputStream;->readLong()J
/* move-result-wide v2 */
/* new-instance v4, Lcom/flurry/android/al; */
v5 = /* invoke-direct {v4}, Lcom/flurry/android/al;-><init>()V */
if ( v5 != null) { // if-eqz v5, :cond_2
this.a = v5;
v5 = } // :cond_2
if ( v5 != null) { // if-eqz v5, :cond_3
this.b = v5;
v5 = } // :cond_3
/* iput v5, v4, Lcom/flurry/android/al;->c:I */
v5 = this.f;
java.lang.Long .valueOf ( v2,v3 );
(( com.flurry.android.af ) v5 ).a ( v2, v4 ); // invoke-virtual {v5, v2, v4}, Lcom/flurry/android/af;->a(Ljava/lang/Object;Ljava/lang/Object;)V
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_4
v0 = (( java.io.DataInputStream ) p1 ).readUnsignedShort ( ); // invoke-virtual {p1}, Ljava/io/DataInputStream;->readUnsignedShort()I
/* new-instance v1, Ljava/util/HashMap; */
/* invoke-direct {v1, v0}, Ljava/util/HashMap;-><init>(I)V */
this.h = v1;
/* move v1, v7 */
} // :goto_3
/* if-ge v1, v0, :cond_5 */
(( java.io.DataInputStream ) p1 ).readUTF ( ); // invoke-virtual {p1}, Ljava/io/DataInputStream;->readUTF()Ljava/lang/String;
/* new-instance v3, Lcom/flurry/android/e; */
/* invoke-direct {v3, p1}, Lcom/flurry/android/e;-><init>(Ljava/io/DataInput;)V */
v4 = this.h;
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_5
v0 = (( java.io.DataInputStream ) p1 ).readUnsignedShort ( ); // invoke-virtual {p1}, Ljava/io/DataInputStream;->readUnsignedShort()I
/* new-instance v1, Ljava/util/HashMap; */
/* invoke-direct {v1, v0}, Ljava/util/HashMap;-><init>(I)V */
this.g = v1;
/* move v1, v7 */
} // :goto_4
/* if-ge v1, v0, :cond_7 */
(( java.io.DataInputStream ) p1 ).readUTF ( ); // invoke-virtual {p1}, Ljava/io/DataInputStream;->readUTF()Ljava/lang/String;
v3 = (( java.io.DataInputStream ) p1 ).readUnsignedShort ( ); // invoke-virtual {p1}, Ljava/io/DataInputStream;->readUnsignedShort()I
/* new-array v4, v3, [Lcom/flurry/android/v; */
/* move v5, v7 */
} // :goto_5
/* if-ge v5, v3, :cond_6 */
/* new-instance v6, Lcom/flurry/android/v; */
/* invoke-direct {v6}, Lcom/flurry/android/v;-><init>()V */
(( com.flurry.android.v ) v6 ).a ( p1 ); // invoke-virtual {v6, p1}, Lcom/flurry/android/v;->a(Ljava/io/DataInput;)V
/* aput-object v6, v4, v5 */
/* add-int/lit8 v5, v5, 0x1 */
} // :cond_6
v3 = this.g;
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_7
v0 = (( java.io.DataInputStream ) p1 ).readUnsignedShort ( ); // invoke-virtual {p1}, Ljava/io/DataInputStream;->readUnsignedShort()I
/* new-instance v1, Ljava/util/HashMap; */
/* invoke-direct {v1}, Ljava/util/HashMap;-><init>()V */
this.i = v1;
/* move v1, v7 */
} // :goto_6
/* if-ge v1, v0, :cond_8 */
v2 = (( java.io.DataInputStream ) p1 ).readByte ( ); // invoke-virtual {p1}, Ljava/io/DataInputStream;->readByte()B
/* new-instance v3, Lcom/flurry/android/c; */
/* invoke-direct {v3}, Lcom/flurry/android/c;-><init>()V */
(( com.flurry.android.c ) v3 ).b ( p1 ); // invoke-virtual {v3, p1}, Lcom/flurry/android/c;->b(Ljava/io/DataInput;)V
v4 = this.i;
java.lang.Byte .valueOf ( v2 );
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_8
v0 = (( java.io.DataInputStream ) p1 ).readUnsignedShort ( ); // invoke-virtual {p1}, Ljava/io/DataInputStream;->readUnsignedShort()I
/* new-instance v1, Ljava/util/HashMap; */
/* invoke-direct {v1, v0}, Ljava/util/HashMap;-><init>(I)V */
this.j = v1;
/* move v1, v7 */
} // :goto_7
/* if-ge v1, v0, :cond_9 */
v2 = (( java.io.DataInputStream ) p1 ).readShort ( ); // invoke-virtual {p1}, Ljava/io/DataInputStream;->readShort()S
(( java.io.DataInputStream ) p1 ).readLong ( ); // invoke-virtual {p1}, Ljava/io/DataInputStream;->readLong()J
/* move-result-wide v3 */
v5 = this.j;
java.lang.Short .valueOf ( v2 );
java.lang.Long .valueOf ( v3,v4 );
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_9
/* invoke-direct {p0}, Lcom/flurry/android/z;->g()V */
final String v0 = "FlurryAgent"; // const-string v0, "FlurryAgent"
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "Cache read, num images: "; // const-string v1, "Cache read, num images: "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.e;
v1 = (( com.flurry.android.af ) v1 ).a ( ); // invoke-virtual {v1}, Lcom/flurry/android/af;->a()I
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.flurry.android.ah .a ( v8,v0 );
/* goto/16 :goto_0 */
} // .end method
private void a ( java.io.DataOutputStream p0 ) {
/* .locals 9 */
int v6 = 1; // const/4 v6, 0x1
int v8 = 0; // const/4 v8, 0x0
int v1 = 2; // const/4 v1, 0x2
(( java.io.DataOutputStream ) p1 ).writeShort ( v1 ); // invoke-virtual {p1, v1}, Ljava/io/DataOutputStream;->writeShort(I)V
/* iget-wide v1, p0, Lcom/flurry/android/z;->d:J */
(( java.io.DataOutputStream ) p1 ).writeLong ( v1, v2 ); // invoke-virtual {p1, v1, v2}, Ljava/io/DataOutputStream;->writeLong(J)V
v1 = this.e;
v2 = (( com.flurry.android.af ) v1 ).b ( ); // invoke-virtual {v1}, Lcom/flurry/android/af;->b()Ljava/util/List;
(( java.io.DataOutputStream ) p1 ).writeShort ( v2 ); // invoke-virtual {p1, v2}, Ljava/io/DataOutputStream;->writeShort(I)V
v1 = } // :goto_0
if ( v1 != null) { // if-eqz v1, :cond_0
/* check-cast v1, Ljava/util/Map$Entry; */
/* check-cast v2, Ljava/lang/Long; */
(( java.lang.Long ) v2 ).longValue ( ); // invoke-virtual {v2}, Ljava/lang/Long;->longValue()J
/* move-result-wide v4 */
(( java.io.DataOutputStream ) p1 ).writeLong ( v4, v5 ); // invoke-virtual {p1, v4, v5}, Ljava/io/DataOutputStream;->writeLong(J)V
/* check-cast v1, Lcom/flurry/android/AdImage; */
/* iget-wide v4, v1, Lcom/flurry/android/AdImage;->a:J */
/* iget v2, v1, Lcom/flurry/android/AdImage;->b:I */
/* iget v2, v1, Lcom/flurry/android/AdImage;->c:I */
v2 = this.d;
v2 = this.e;
/* array-length v2, v2 */
v1 = this.e;
} // :cond_0
v1 = this.f;
v2 = (( com.flurry.android.af ) v1 ).b ( ); // invoke-virtual {v1}, Lcom/flurry/android/af;->b()Ljava/util/List;
(( java.io.DataOutputStream ) p1 ).writeShort ( v2 ); // invoke-virtual {p1, v2}, Ljava/io/DataOutputStream;->writeShort(I)V
v1 = } // :goto_1
if ( v1 != null) { // if-eqz v1, :cond_5
/* move-object v0, v1 */
/* check-cast v0, Ljava/util/Map$Entry; */
/* move-object v2, v0 */
/* check-cast v1, Ljava/lang/Long; */
(( java.lang.Long ) v1 ).longValue ( ); // invoke-virtual {v1}, Ljava/lang/Long;->longValue()J
/* move-result-wide v4 */
(( java.io.DataOutputStream ) p1 ).writeLong ( v4, v5 ); // invoke-virtual {p1, v4, v5}, Ljava/io/DataOutputStream;->writeLong(J)V
/* check-cast v1, Lcom/flurry/android/al; */
v2 = this.a;
if ( v2 != null) { // if-eqz v2, :cond_3
/* move v2, v6 */
} // :goto_2
if ( v2 != null) { // if-eqz v2, :cond_1
v2 = this.a;
} // :cond_1
v2 = this.b;
if ( v2 != null) { // if-eqz v2, :cond_4
/* move v2, v6 */
} // :goto_3
if ( v2 != null) { // if-eqz v2, :cond_2
v2 = this.b;
} // :cond_2
/* iget v1, v1, Lcom/flurry/android/al;->c:I */
} // :cond_3
/* move v2, v8 */
} // :cond_4
/* move v2, v8 */
} // :cond_5
v1 = v1 = this.h;
(( java.io.DataOutputStream ) p1 ).writeShort ( v1 ); // invoke-virtual {p1, v1}, Ljava/io/DataOutputStream;->writeShort(I)V
v1 = this.h;
v1 = } // :goto_4
if ( v1 != null) { // if-eqz v1, :cond_6
/* move-object v0, v1 */
/* check-cast v0, Ljava/util/Map$Entry; */
/* move-object v2, v0 */
/* check-cast v1, Ljava/lang/String; */
(( java.io.DataOutputStream ) p1 ).writeUTF ( v1 ); // invoke-virtual {p1, v1}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V
/* check-cast v1, Lcom/flurry/android/e; */
v2 = this.a;
/* iget-byte v2, v1, Lcom/flurry/android/e;->b:B */
/* iget-byte v1, v1, Lcom/flurry/android/e;->c:B */
} // :cond_6
v1 = v1 = this.g;
(( java.io.DataOutputStream ) p1 ).writeShort ( v1 ); // invoke-virtual {p1, v1}, Ljava/io/DataOutputStream;->writeShort(I)V
v1 = this.g;
v1 = } // :cond_7
if ( v1 != null) { // if-eqz v1, :cond_9
/* check-cast v1, Ljava/util/Map$Entry; */
/* check-cast v2, Ljava/lang/String; */
(( java.io.DataOutputStream ) p1 ).writeUTF ( v2 ); // invoke-virtual {p1, v2}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V
/* check-cast v1, [Lcom/flurry/android/v; */
/* if-nez v1, :cond_8 */
/* move v2, v8 */
} // :goto_5
(( java.io.DataOutputStream ) p1 ).writeShort ( v2 ); // invoke-virtual {p1, v2}, Ljava/io/DataOutputStream;->writeShort(I)V
/* move v4, v8 */
} // :goto_6
/* if-ge v4, v2, :cond_7 */
/* aget-object v5, v1, v4 */
/* iget-wide v6, v5, Lcom/flurry/android/v;->a:J */
/* iget-wide v6, v5, Lcom/flurry/android/v;->b:J */
v6 = this.d;
v6 = this.c;
/* iget-wide v6, v5, Lcom/flurry/android/v;->e:J */
v6 = this.f;
(( java.lang.Long ) v6 ).longValue ( ); // invoke-virtual {v6}, Ljava/lang/Long;->longValue()J
/* move-result-wide v6 */
v6 = this.g;
/* array-length v6, v6 */
v5 = this.g;
/* add-int/lit8 v4, v4, 0x1 */
} // :cond_8
/* array-length v2, v1 */
} // :cond_9
v1 = v1 = this.i;
(( java.io.DataOutputStream ) p1 ).writeShort ( v1 ); // invoke-virtual {p1, v1}, Ljava/io/DataOutputStream;->writeShort(I)V
v1 = this.i;
v1 = } // :goto_7
if ( v1 != null) { // if-eqz v1, :cond_a
/* check-cast v1, Ljava/util/Map$Entry; */
/* check-cast v2, Ljava/lang/Byte; */
v2 = (( java.lang.Byte ) v2 ).byteValue ( ); // invoke-virtual {v2}, Ljava/lang/Byte;->byteValue()B
(( java.io.DataOutputStream ) p1 ).writeByte ( v2 ); // invoke-virtual {p1, v2}, Ljava/io/DataOutputStream;->writeByte(I)V
/* check-cast v1, Lcom/flurry/android/c; */
(( com.flurry.android.c ) v1 ).a ( p1 ); // invoke-virtual {v1, p1}, Lcom/flurry/android/c;->a(Ljava/io/DataOutput;)V
} // :cond_a
v1 = v1 = this.j;
(( java.io.DataOutputStream ) p1 ).writeShort ( v1 ); // invoke-virtual {p1, v1}, Ljava/io/DataOutputStream;->writeShort(I)V
v1 = this.j;
v1 = } // :goto_8
if ( v1 != null) { // if-eqz v1, :cond_b
/* move-object v0, p0 */
/* check-cast v0, Ljava/util/Map$Entry; */
/* move-object v1, v0 */
/* check-cast p0, Ljava/lang/Short; */
v3 = (( java.lang.Short ) p0 ).shortValue ( ); // invoke-virtual {p0}, Ljava/lang/Short;->shortValue()S
(( java.io.DataOutputStream ) p1 ).writeShort ( v3 ); // invoke-virtual {p1, v3}, Ljava/io/DataOutputStream;->writeShort(I)V
/* check-cast p0, Ljava/lang/Long; */
(( java.lang.Long ) p0 ).longValue ( ); // invoke-virtual {p0}, Ljava/lang/Long;->longValue()J
/* move-result-wide v3 */
(( java.io.DataOutputStream ) p1 ).writeLong ( v3, v4 ); // invoke-virtual {p1, v3, v4}, Ljava/io/DataOutputStream;->writeLong(J)V
} // :cond_b
return;
} // .end method
private static void a ( java.io.File p0 ) {
/* .locals 2 */
v0 = (( java.io.File ) p0 ).delete ( ); // invoke-virtual {p0}, Ljava/io/File;->delete()Z
/* if-nez v0, :cond_0 */
final String v0 = "FlurryAgent"; // const-string v0, "FlurryAgent"
final String v1 = "Cannot delete cached ads"; // const-string v1, "Cannot delete cached ads"
com.flurry.android.ah .b ( v0,v1 );
} // :cond_0
return;
} // .end method
private synchronized com.flurry.android.al b ( Long p0 ) {
/* .locals 2 */
/* monitor-enter p0 */
try { // :try_start_0
v0 = this.f;
java.lang.Long .valueOf ( p1,p2 );
(( com.flurry.android.af ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/flurry/android/af;->a(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v0, Lcom/flurry/android/al; */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* monitor-exit p0 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
private void g ( ) {
/* .locals 9 */
final String v8 = "Ad "; // const-string v8, "Ad "
final String v7 = "FlurryAgent"; // const-string v7, "FlurryAgent"
v0 = this.i;
v1 = } // :goto_0
if ( v1 != null) { // if-eqz v1, :cond_0
} // :cond_0
v0 = this.g;
v0 = } // :cond_1
if ( v0 != null) { // if-eqz v0, :cond_4
/* check-cast v0, [Lcom/flurry/android/v; */
if ( v0 != null) { // if-eqz v0, :cond_1
/* array-length v2, v0 */
int v3 = 0; // const/4 v3, 0x0
} // :goto_1
/* if-ge v3, v2, :cond_1 */
/* aget-object v4, v0, v3 */
v5 = this.f;
(( java.lang.Long ) v5 ).longValue ( ); // invoke-virtual {v5}, Ljava/lang/Long;->longValue()J
/* move-result-wide v5 */
(( com.flurry.android.z ) p0 ).a ( v5, v6 ); // invoke-virtual {p0, v5, v6}, Lcom/flurry/android/z;->a(J)Lcom/flurry/android/AdImage;
this.h = v5;
v5 = this.h;
/* if-nez v5, :cond_2 */
final String v5 = "FlurryAgent"; // const-string v5, "FlurryAgent"
/* new-instance v5, Ljava/lang/StringBuilder; */
/* invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V */
final String v6 = "Ad "; // const-string v6, "Ad "
(( java.lang.StringBuilder ) v5 ).append ( v8 ); // invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v6 = this.d;
(( java.lang.StringBuilder ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v6 = " has no image"; // const-string v6, " has no image"
(( java.lang.StringBuilder ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v5 ).toString ( ); // invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.flurry.android.ah .b ( v7,v5 );
} // :cond_2
/* iget-wide v5, v4, Lcom/flurry/android/v;->a:J */
/* invoke-direct {p0, v5, v6}, Lcom/flurry/android/z;->b(J)Lcom/flurry/android/al; */
/* if-nez v5, :cond_3 */
final String v5 = "FlurryAgent"; // const-string v5, "FlurryAgent"
/* new-instance v5, Ljava/lang/StringBuilder; */
/* invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V */
final String v6 = "Ad "; // const-string v6, "Ad "
(( java.lang.StringBuilder ) v5 ).append ( v8 ); // invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v4 = this.d;
(( java.lang.StringBuilder ) v5 ).append ( v4 ); // invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v5 = " has no pricing"; // const-string v5, " has no pricing"
(( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.flurry.android.ah .b ( v7,v4 );
} // :cond_3
/* add-int/lit8 v3, v3, 0x1 */
} // :cond_4
v0 = this.h;
} // :cond_5
v0 = } // :goto_2
if ( v0 != null) { // if-eqz v0, :cond_6
/* check-cast v0, Lcom/flurry/android/e; */
/* iget-byte v2, v0, Lcom/flurry/android/e;->c:B */
/* invoke-direct {p0, v2}, Lcom/flurry/android/z;->a(B)Lcom/flurry/android/c; */
this.d = v2;
v2 = this.d;
/* if-nez v2, :cond_5 */
final String v2 = "FlurryAgent"; // const-string v2, "FlurryAgent"
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "No ad theme found for "; // const-string v3, "No ad theme found for "
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget-byte v0, v0, Lcom/flurry/android/e;->c:B */
(( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.flurry.android.ah .d ( v7,v0 );
} // :cond_6
return;
} // .end method
private java.lang.String h ( ) {
/* .locals 3 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = ".flurryappcircle."; // const-string v1, ".flurryappcircle."
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.c;
v1 = this.a;
v1 = (( java.lang.String ) v1 ).hashCode ( ); // invoke-virtual {v1}, Ljava/lang/String;->hashCode()I
/* const/16 v2, 0x10 */
java.lang.Integer .toString ( v1,v2 );
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
/* # virtual methods */
synchronized final com.flurry.android.AdImage a ( Long p0 ) {
/* .locals 2 */
/* monitor-enter p0 */
try { // :try_start_0
v0 = this.e;
java.lang.Long .valueOf ( p1,p2 );
(( com.flurry.android.af ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/flurry/android/af;->a(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v0, Lcom/flurry/android/AdImage; */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* monitor-exit p0 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
synchronized final java.util.Set a ( ) {
/* .locals 1 */
/* monitor-enter p0 */
try { // :try_start_0
v0 = this.e;
(( com.flurry.android.af ) v0 ).c ( ); // invoke-virtual {v0}, Lcom/flurry/android/af;->c()Ljava/util/Set;
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* monitor-exit p0 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
final void a ( android.content.Context p0, Object p1, Object p2 ) {
/* .locals 0 */
this.a = p1;
this.b = p2;
this.c = p3;
return;
} // .end method
synchronized final void a ( java.util.Map p0, java.util.Map p1, java.util.Map p2, java.util.Map p3, java.util.Map p4, java.util.Map p5 ) {
/* .locals 5 */
/* monitor-enter p0 */
try { // :try_start_0
java.lang.System .currentTimeMillis ( );
/* move-result-wide v0 */
/* iput-wide v0, p0, Lcom/flurry/android/z;->d:J */
} // :cond_0
v0 = } // :goto_0
if ( v0 != null) { // if-eqz v0, :cond_1
/* check-cast v0, Ljava/util/Map$Entry; */
if ( v2 != null) { // if-eqz v2, :cond_0
v2 = this.e;
(( com.flurry.android.af ) v2 ).a ( v3, v0 ); // invoke-virtual {v2, v3, v0}, Lcom/flurry/android/af;->a(Ljava/lang/Object;Ljava/lang/Object;)V
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // :cond_1
try { // :try_start_1
} // :cond_2
v0 = } // :goto_1
if ( v0 != null) { // if-eqz v0, :cond_3
/* check-cast v0, Ljava/util/Map$Entry; */
if ( v2 != null) { // if-eqz v2, :cond_2
v2 = this.f;
(( com.flurry.android.af ) v2 ).a ( v3, v0 ); // invoke-virtual {v2, v3, v0}, Lcom/flurry/android/af;->a(Ljava/lang/Object;Ljava/lang/Object;)V
} // :cond_3
v0 = if ( p2 != null) { // if-eqz p2, :cond_4
/* if-nez v0, :cond_4 */
this.h = p2;
} // :cond_4
v0 = if ( p3 != null) { // if-eqz p3, :cond_5
/* if-nez v0, :cond_5 */
this.i = p3;
} // :cond_5
v0 = if ( p6 != null) { // if-eqz p6, :cond_6
/* if-nez v0, :cond_6 */
this.j = p6;
} // :cond_6
/* new-instance v0, Ljava/util/HashMap; */
/* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
this.g = v0;
} // :cond_7
v0 = } // :goto_2
if ( v0 != null) { // if-eqz v0, :cond_9
/* check-cast v0, Ljava/util/Map$Entry; */
/* check-cast v1, Lcom/flurry/android/e; */
/* iget-byte v2, v1, Lcom/flurry/android/e;->b:B */
java.lang.Byte .valueOf ( v2 );
/* check-cast v2, [Lcom/flurry/android/v; */
if ( v2 != null) { // if-eqz v2, :cond_8
v4 = this.g;
} // :cond_8
/* iget-byte v0, v1, Lcom/flurry/android/e;->c:B */
java.lang.Byte .valueOf ( v0 );
/* check-cast v0, Lcom/flurry/android/c; */
if ( v0 != null) { // if-eqz v0, :cond_7
this.d = v0;
} // :cond_9
/* invoke-direct {p0}, Lcom/flurry/android/z;->g()V */
/* const/16 v0, 0xca */
/* invoke-direct {p0, v0}, Lcom/flurry/android/z;->a(I)V */
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* monitor-exit p0 */
return;
} // .end method
synchronized final com.flurry.android.v a ( java.lang.String p0 ) {
/* .locals 2 */
/* monitor-enter p0 */
try { // :try_start_0
v0 = this.g;
/* check-cast v0, [Lcom/flurry/android/v; */
/* if-nez v0, :cond_0 */
v0 = this.g;
final String v1 = ""; // const-string v1, ""
/* check-cast v0, [Lcom/flurry/android/v; */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
} // :cond_0
/* monitor-exit p0 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
synchronized final com.flurry.android.AdImage b ( ) {
/* .locals 2 */
/* monitor-enter p0 */
try { // :try_start_0
v0 = this.j;
int v1 = 1; // const/4 v1, 0x1
java.lang.Short .valueOf ( v1 );
/* check-cast v0, Ljava/lang/Long; */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* if-nez v0, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
/* monitor-exit p0 */
} // :cond_0
try { // :try_start_1
(( java.lang.Long ) v0 ).longValue ( ); // invoke-virtual {v0}, Ljava/lang/Long;->longValue()J
/* move-result-wide v0 */
(( com.flurry.android.z ) p0 ).a ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lcom/flurry/android/z;->a(J)Lcom/flurry/android/AdImage;
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
synchronized final com.flurry.android.e b ( java.lang.String p0 ) {
/* .locals 2 */
/* monitor-enter p0 */
try { // :try_start_0
v0 = this.h;
/* check-cast v0, Lcom/flurry/android/e; */
/* if-nez v0, :cond_0 */
v0 = this.h;
final String v1 = ""; // const-string v1, ""
/* check-cast v0, Lcom/flurry/android/e; */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
} // :cond_0
/* monitor-exit p0 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
final Boolean c ( ) {
/* .locals 1 */
/* iget-boolean v0, p0, Lcom/flurry/android/z;->k:Z */
} // .end method
final Long d ( ) {
/* .locals 2 */
/* iget-wide v0, p0, Lcom/flurry/android/z;->d:J */
/* return-wide v0 */
} // .end method
synchronized final void e ( ) {
/* .locals 6 */
final String v0 = "FlurryAgent"; // const-string v0, "FlurryAgent"
/* monitor-enter p0 */
try { // :try_start_0
v0 = this.a;
/* invoke-direct {p0}, Lcom/flurry/android/z;->h()Ljava/lang/String; */
(( android.content.Context ) v0 ).getFileStreamPath ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/Context;->getFileStreamPath(Ljava/lang/String;)Ljava/io/File;
(( java.io.File ) v0 ).exists ( ); // invoke-virtual {v0}, Ljava/io/File;->exists()Z
/* :try_end_0 */
v1 = /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
if ( v1 != null) { // if-eqz v1, :cond_1
int v1 = 0; // const/4 v1, 0x0
try { // :try_start_1
/* new-instance v2, Ljava/io/FileInputStream; */
/* invoke-direct {v2, v0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V */
/* new-instance v3, Ljava/io/DataInputStream; */
/* invoke-direct {v3, v2}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V */
/* :try_end_1 */
/* .catch Ljava/lang/Throwable; {:try_start_1 ..:try_end_1} :catch_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_1 */
try { // :try_start_2
v1 = (( java.io.DataInputStream ) v3 ).readUnsignedShort ( ); // invoke-virtual {v3}, Ljava/io/DataInputStream;->readUnsignedShort()I
/* const v2, 0xb5fb */
/* if-ne v1, v2, :cond_0 */
/* invoke-direct {p0, v3}, Lcom/flurry/android/z;->a(Ljava/io/DataInputStream;)V */
/* const/16 v1, 0xc9 */
/* invoke-direct {p0, v1}, Lcom/flurry/android/z;->a(I)V */
/* :try_end_2 */
/* .catch Ljava/lang/Throwable; {:try_start_2 ..:try_end_2} :catch_0 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_2 */
} // :goto_0
try { // :try_start_3
com.flurry.android.r .a ( v3 );
/* :try_end_3 */
/* .catchall {:try_start_3 ..:try_end_3} :catchall_0 */
} // :goto_1
/* monitor-exit p0 */
return;
} // :cond_0
try { // :try_start_4
com.flurry.android.z .a ( v0 );
/* :try_end_4 */
/* .catch Ljava/lang/Throwable; {:try_start_4 ..:try_end_4} :catch_0 */
/* .catchall {:try_start_4 ..:try_end_4} :catchall_2 */
/* :catch_0 */
/* move-exception v1 */
/* move-object v2, v3 */
} // :goto_2
try { // :try_start_5
final String v3 = "FlurryAgent"; // const-string v3, "FlurryAgent"
final String v4 = "Discarding cache"; // const-string v4, "Discarding cache"
com.flurry.android.ah .a ( v3,v4,v1 );
com.flurry.android.z .a ( v0 );
/* :try_end_5 */
/* .catchall {:try_start_5 ..:try_end_5} :catchall_3 */
try { // :try_start_6
com.flurry.android.r .a ( v2 );
/* :try_end_6 */
/* .catchall {:try_start_6 ..:try_end_6} :catchall_0 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
/* :catchall_1 */
/* move-exception v0 */
} // :goto_3
try { // :try_start_7
com.flurry.android.r .a ( v1 );
/* throw v0 */
} // :cond_1
final String v1 = "FlurryAgent"; // const-string v1, "FlurryAgent"
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "cache file does not exist, path="; // const-string v3, "cache file does not exist, path="
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.io.File ) v0 ).getAbsolutePath ( ); // invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
(( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.flurry.android.ah .c ( v1,v0 );
/* :try_end_7 */
/* .catchall {:try_start_7 ..:try_end_7} :catchall_0 */
/* :catchall_2 */
/* move-exception v0 */
/* move-object v1, v3 */
/* :catchall_3 */
/* move-exception v0 */
/* move-object v1, v2 */
/* :catch_1 */
/* move-exception v2 */
/* move-object v5, v2 */
/* move-object v2, v1 */
/* move-object v1, v5 */
} // .end method
synchronized final void f ( ) {
/* .locals 6 */
int v4 = 0; // const/4 v4, 0x0
final String v0 = "FlurryAgent"; // const-string v0, "FlurryAgent"
/* monitor-enter p0 */
try { // :try_start_0
v0 = this.a;
/* invoke-direct {p0}, Lcom/flurry/android/z;->h()Ljava/lang/String; */
(( android.content.Context ) v0 ).getFileStreamPath ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/Context;->getFileStreamPath(Ljava/lang/String;)Ljava/io/File;
(( java.io.File ) v0 ).getParentFile ( ); // invoke-virtual {v0}, Ljava/io/File;->getParentFile()Ljava/io/File;
v2 = (( java.io.File ) v1 ).mkdirs ( ); // invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z
/* if-nez v2, :cond_0 */
v2 = (( java.io.File ) v1 ).exists ( ); // invoke-virtual {v1}, Ljava/io/File;->exists()Z
/* if-nez v2, :cond_0 */
final String v0 = "FlurryAgent"; // const-string v0, "FlurryAgent"
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "Unable to create persistent dir: "; // const-string v3, "Unable to create persistent dir: "
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.flurry.android.ah .b ( v0,v1 );
/* :try_end_0 */
/* .catch Ljava/lang/Throwable; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_1 */
int v0 = 0; // const/4 v0, 0x0
try { // :try_start_1
com.flurry.android.r .a ( v0 );
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
} // :goto_0
/* monitor-exit p0 */
return;
} // :cond_0
try { // :try_start_2
/* new-instance v1, Ljava/io/FileOutputStream; */
/* invoke-direct {v1, v0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V */
/* new-instance v0, Ljava/io/DataOutputStream; */
/* invoke-direct {v0, v1}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V */
/* :try_end_2 */
/* .catch Ljava/lang/Throwable; {:try_start_2 ..:try_end_2} :catch_0 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_1 */
/* const v1, 0xb5fb */
try { // :try_start_3
(( java.io.DataOutputStream ) v0 ).writeShort ( v1 ); // invoke-virtual {v0, v1}, Ljava/io/DataOutputStream;->writeShort(I)V
/* invoke-direct {p0, v0}, Lcom/flurry/android/z;->a(Ljava/io/DataOutputStream;)V */
/* :try_end_3 */
/* .catch Ljava/lang/Throwable; {:try_start_3 ..:try_end_3} :catch_1 */
/* .catchall {:try_start_3 ..:try_end_3} :catchall_2 */
try { // :try_start_4
com.flurry.android.r .a ( v0 );
/* :try_end_4 */
/* .catchall {:try_start_4 ..:try_end_4} :catchall_0 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
/* :catch_0 */
/* move-exception v0 */
/* move-object v1, v4 */
} // :goto_1
try { // :try_start_5
final String v2 = "FlurryAgent"; // const-string v2, "FlurryAgent"
final String v3 = ""; // const-string v3, ""
com.flurry.android.ah .b ( v2,v3,v0 );
/* :try_end_5 */
/* .catchall {:try_start_5 ..:try_end_5} :catchall_3 */
try { // :try_start_6
com.flurry.android.r .a ( v1 );
/* :catchall_1 */
/* move-exception v0 */
/* move-object v1, v4 */
} // :goto_2
com.flurry.android.r .a ( v1 );
/* throw v0 */
/* :try_end_6 */
/* .catchall {:try_start_6 ..:try_end_6} :catchall_0 */
/* :catchall_2 */
/* move-exception v1 */
/* move-object v5, v1 */
/* move-object v1, v0 */
/* move-object v0, v5 */
/* :catchall_3 */
/* move-exception v0 */
/* :catch_1 */
/* move-exception v1 */
/* move-object v5, v1 */
/* move-object v1, v0 */
/* move-object v0, v5 */
} // .end method
public final java.lang.String toString ( ) {
/* .locals 7 */
final String v6 = ",\n"; // const-string v6, ",\n"
final String v5 = "):"; // const-string v5, "):"
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v0 = "{"; // const-string v0, "{"
(( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "adImages ("; // const-string v1, "adImages ("
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.e;
v1 = (( com.flurry.android.af ) v1 ).b ( ); // invoke-virtual {v1}, Lcom/flurry/android/af;->b()Ljava/util/List;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v1 = "),\n"; // const-string v1, "),\n"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "adBlock ("; // const-string v1, "adBlock ("
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = v1 = this.g;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v1 = "):"; // const-string v1, "):"
(( java.lang.StringBuilder ) v0 ).append ( v5 ); // invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = ",\n"; // const-string v1, ",\n"
(( java.lang.StringBuilder ) v0 ).append ( v6 ); // invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v0 = this.g;
v0 = } // :goto_0
if ( v0 != null) { // if-eqz v0, :cond_0
/* check-cast v0, Ljava/util/Map$Entry; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v4 = "\t"; // const-string v4, "\t"
(( java.lang.StringBuilder ) v1 ).append ( v4 ); // invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* check-cast v1, Ljava/lang/String; */
(( java.lang.StringBuilder ) v4 ).append ( v1 ); // invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v4 = ": "; // const-string v4, ": "
(( java.lang.StringBuilder ) v1 ).append ( v4 ); // invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* check-cast v0, [Ljava/lang/Object; */
java.util.Arrays .toString ( v0 );
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
} // :cond_0
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "adHooks ("; // const-string v1, "adHooks ("
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = v1 = this.h;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v1 = "):"; // const-string v1, "):"
(( java.lang.StringBuilder ) v0 ).append ( v5 ); // invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.h;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = ",\n"; // const-string v1, ",\n"
(( java.lang.StringBuilder ) v0 ).append ( v6 ); // invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "adThemes ("; // const-string v1, "adThemes ("
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = v1 = this.i;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v1 = "):"; // const-string v1, "):"
(( java.lang.StringBuilder ) v0 ).append ( v5 ); // invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.i;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = ",\n"; // const-string v1, ",\n"
(( java.lang.StringBuilder ) v0 ).append ( v6 ); // invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "auxMap ("; // const-string v1, "auxMap ("
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = v1 = this.j;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v1 = "):"; // const-string v1, "):"
(( java.lang.StringBuilder ) v0 ).append ( v5 ); // invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.j;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = ",\n"; // const-string v1, ",\n"
(( java.lang.StringBuilder ) v0 ).append ( v6 ); // invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v0 = "}"; // const-string v0, "}"
(( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( p2 ); // invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.flurry.android.ah .a ( v2,v0 );
/* new-instance v0, Lorg/apache/http/entity/ByteArrayEntity; */
/* invoke-direct {v0, p1}, Lorg/apache/http/entity/ByteArrayEntity;-><init>([B)V */
final String v1 = "application/octet-stream"; // const-string v1, "application/octet-stream"
(( org.apache.http.entity.ByteArrayEntity ) v0 ).setContentType ( v1 ); // invoke-virtual {v0, v1}, Lorg/apache/http/entity/ByteArrayEntity;->setContentType(Ljava/lang/String;)V
/* new-instance v1, Lorg/apache/http/client/methods/HttpPost; */
/* invoke-direct {v1, p2}, Lorg/apache/http/client/methods/HttpPost;-><init>(Ljava/lang/String;)V */
(( org.apache.http.client.methods.HttpPost ) v1 ).setEntity ( v0 ); // invoke-virtual {v1, v0}, Lorg/apache/http/client/methods/HttpPost;->setEntity(Lorg/apache/http/HttpEntity;)V
/* new-instance v0, Lorg/apache/http/params/BasicHttpParams; */
/* invoke-direct {v0}, Lorg/apache/http/params/BasicHttpParams;-><init>()V */
/* const/16 v2, 0x2710 */
org.apache.http.params.HttpConnectionParams .setConnectionTimeout ( v0,v2 );
/* const/16 v2, 0x3a98 */
org.apache.http.params.HttpConnectionParams .setSoTimeout ( v0,v2 );
(( org.apache.http.client.methods.HttpPost ) v1 ).getParams ( ); // invoke-virtual {v1}, Lorg/apache/http/client/methods/HttpPost;->getParams()Lorg/apache/http/params/HttpParams;
final String v3 = "http.protocol.expect-continue"; // const-string v3, "http.protocol.expect-continue"
v1 = com.flurry.android.FlurryAgent .a ( v0 );
/* monitor-enter p0 */
/* const/16 v2, 0xc8 */
/* if-ne v1, v2, :cond_2 */
try { // :try_start_0
final String v1 = "FlurryAgent"; // const-string v1, "FlurryAgent"
final String v2 = "Report successful"; // const-string v2, "Report successful"
com.flurry.android.ah .a ( v1,v2 );
int v1 = 1; // const/4 v1, 0x1
/* iput-boolean v1, p0, Lcom/flurry/android/FlurryAgent;->G:Z */
v1 = this.I;
v2 = this.D;
final String v1 = "FlurryAgent"; // const-string v1, "FlurryAgent"
final String v2 = "Processing report response"; // const-string v2, "Processing report response"
com.flurry.android.ah .a ( v1,v2 );
if ( v0 != null) { // if-eqz v0, :cond_1
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* move-result-wide v1 */
/* const-wide/16 v3, 0x0 */
/* cmp-long v1, v1, v3 */
if ( v1 != null) { // if-eqz v1, :cond_1
try { // :try_start_1
/* new-instance v2, Ljava/io/DataInputStream; */
/* invoke-direct {v2, v1}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V */
/* invoke-direct {p0, v2}, Lcom/flurry/android/FlurryAgent;->a(Ljava/io/DataInputStream;)V */
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_1 */
try { // :try_start_2
/* move v0, v5 */
} // :goto_1
int v1 = 0; // const/4 v1, 0x0
this.D = v1;
/* monitor-exit p0 */
/* goto/16 :goto_0 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* :try_end_2 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
/* throw v0 */
/* :catchall_1 */
/* move-exception v1 */
try { // :try_start_3
/* throw v1 */
} // :cond_1
/* move v0, v5 */
} // :cond_2
final String v0 = "FlurryAgent"; // const-string v0, "FlurryAgent"
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "Report failed.HTTP response: "; // const-string v3, "Report failed.HTTP response: "
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.flurry.android.ah .a ( v0,v1 );
/* :try_end_3 */
/* .catchall {:try_start_3 ..:try_end_3} :catchall_0 */
/* move v0, v4 */
} // .end method
private synchronized a ( Boolean p0 ) {
/* .locals 8 */
int v7 = 0; // const/4 v7, 0x0
int v6 = 0; // const/4 v6, 0x0
/* monitor-enter p0 */
try { // :try_start_0
/* new-instance v1, Ljava/io/ByteArrayOutputStream; */
/* invoke-direct {v1}, Ljava/io/ByteArrayOutputStream;-><init>()V */
/* new-instance v2, Ljava/io/DataOutputStream; */
/* invoke-direct {v2, v1}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V */
/* :try_end_0 */
/* .catch Ljava/lang/Throwable; {:try_start_0 ..:try_end_0} :catch_1 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_2 */
/* const/16 v0, 0xf */
try { // :try_start_1
(( java.io.DataOutputStream ) v2 ).writeShort ( v0 ); // invoke-virtual {v2, v0}, Ljava/io/DataOutputStream;->writeShort(I)V
/* sget-boolean v0, Lcom/flurry/android/FlurryAgent;->q:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
if ( p1 != null) { // if-eqz p1, :cond_0
int v0 = 1; // const/4 v0, 0x1
(( java.io.DataOutputStream ) v2 ).writeShort ( v0 ); // invoke-virtual {v2, v0}, Ljava/io/DataOutputStream;->writeShort(I)V
} // :goto_0
/* sget-boolean v0, Lcom/flurry/android/FlurryAgent;->q:Z */
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = this.aa;
(( com.flurry.android.u ) v0 ).d ( ); // invoke-virtual {v0}, Lcom/flurry/android/u;->d()J
/* move-result-wide v3 */
(( java.io.DataOutputStream ) v2 ).writeLong ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Ljava/io/DataOutputStream;->writeLong(J)V
v0 = this.aa;
v3 = (( com.flurry.android.u ) v0 ).e ( ); // invoke-virtual {v0}, Lcom/flurry/android/u;->e()Ljava/util/Set;
(( java.io.DataOutputStream ) v2 ).writeShort ( v3 ); // invoke-virtual {v2, v3}, Ljava/io/DataOutputStream;->writeShort(I)V
v0 = } // :goto_1
if ( v0 != null) { // if-eqz v0, :cond_2
/* check-cast v0, Ljava/lang/Long; */
(( java.lang.Long ) v0 ).longValue ( ); // invoke-virtual {v0}, Ljava/lang/Long;->longValue()J
/* move-result-wide v4 */
int v0 = 1; // const/4 v0, 0x1
(( java.io.DataOutputStream ) v2 ).writeByte ( v0 ); // invoke-virtual {v2, v0}, Ljava/io/DataOutputStream;->writeByte(I)V
(( java.io.DataOutputStream ) v2 ).writeLong ( v4, v5 ); // invoke-virtual {v2, v4, v5}, Ljava/io/DataOutputStream;->writeLong(J)V
/* :try_end_1 */
/* .catch Ljava/lang/Throwable; {:try_start_1 ..:try_end_1} :catch_0 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* :catch_0 */
/* move-exception v0 */
/* move-object v1, v2 */
} // :goto_2
try { // :try_start_2
final String v2 = "FlurryAgent"; // const-string v2, "FlurryAgent"
final String v3 = "Error when generating report"; // const-string v3, "Error when generating report"
com.flurry.android.ah .b ( v2,v3,v0 );
/* :try_end_2 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_3 */
try { // :try_start_3
com.flurry.android.r .a ( v1 );
/* :try_end_3 */
/* .catchall {:try_start_3 ..:try_end_3} :catchall_1 */
/* move-object v0, v7 */
} // :goto_3
/* monitor-exit p0 */
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
try { // :try_start_4
(( java.io.DataOutputStream ) v2 ).writeShort ( v0 ); // invoke-virtual {v2, v0}, Ljava/io/DataOutputStream;->writeShort(I)V
/* :try_end_4 */
/* .catch Ljava/lang/Throwable; {:try_start_4 ..:try_end_4} :catch_0 */
/* .catchall {:try_start_4 ..:try_end_4} :catchall_0 */
/* :catchall_0 */
/* move-exception v0 */
/* move-object v1, v2 */
} // :goto_4
try { // :try_start_5
com.flurry.android.r .a ( v1 );
/* throw v0 */
/* :try_end_5 */
/* .catchall {:try_start_5 ..:try_end_5} :catchall_1 */
/* :catchall_1 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // :cond_1
/* const-wide/16 v3, 0x0 */
try { // :try_start_6
(( java.io.DataOutputStream ) v2 ).writeLong ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Ljava/io/DataOutputStream;->writeLong(J)V
int v0 = 0; // const/4 v0, 0x0
(( java.io.DataOutputStream ) v2 ).writeShort ( v0 ); // invoke-virtual {v2, v0}, Ljava/io/DataOutputStream;->writeShort(I)V
} // :cond_2
int v0 = 3; // const/4 v0, 0x3
(( java.io.DataOutputStream ) v2 ).writeShort ( v0 ); // invoke-virtual {v2, v0}, Ljava/io/DataOutputStream;->writeShort(I)V
/* const/16 v0, 0x79 */
(( java.io.DataOutputStream ) v2 ).writeShort ( v0 ); // invoke-virtual {v2, v0}, Ljava/io/DataOutputStream;->writeShort(I)V
java.lang.System .currentTimeMillis ( );
/* move-result-wide v3 */
(( java.io.DataOutputStream ) v2 ).writeLong ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Ljava/io/DataOutputStream;->writeLong(J)V
v0 = this.z;
(( java.io.DataOutputStream ) v2 ).writeUTF ( v0 ); // invoke-virtual {v2, v0}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V
v0 = this.B;
(( java.io.DataOutputStream ) v2 ).writeUTF ( v0 ); // invoke-virtual {v2, v0}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V
int v0 = 0; // const/4 v0, 0x0
(( java.io.DataOutputStream ) v2 ).writeShort ( v0 ); // invoke-virtual {v2, v0}, Ljava/io/DataOutputStream;->writeShort(I)V
v0 = this.F;
(( java.io.DataOutputStream ) v2 ).writeUTF ( v0 ); // invoke-virtual {v2, v0}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V
/* iget-wide v3, p0, Lcom/flurry/android/FlurryAgent;->H:J */
(( java.io.DataOutputStream ) v2 ).writeLong ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Ljava/io/DataOutputStream;->writeLong(J)V
/* iget-wide v3, p0, Lcom/flurry/android/FlurryAgent;->J:J */
(( java.io.DataOutputStream ) v2 ).writeLong ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Ljava/io/DataOutputStream;->writeLong(J)V
int v0 = 6; // const/4 v0, 0x6
(( java.io.DataOutputStream ) v2 ).writeShort ( v0 ); // invoke-virtual {v2, v0}, Ljava/io/DataOutputStream;->writeShort(I)V
final String v0 = "device.model"; // const-string v0, "device.model"
(( java.io.DataOutputStream ) v2 ).writeUTF ( v0 ); // invoke-virtual {v2, v0}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V
v0 = android.os.Build.MODEL;
(( java.io.DataOutputStream ) v2 ).writeUTF ( v0 ); // invoke-virtual {v2, v0}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V
final String v0 = "build.brand"; // const-string v0, "build.brand"
(( java.io.DataOutputStream ) v2 ).writeUTF ( v0 ); // invoke-virtual {v2, v0}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V
v0 = android.os.Build.BRAND;
(( java.io.DataOutputStream ) v2 ).writeUTF ( v0 ); // invoke-virtual {v2, v0}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V
final String v0 = "build.id"; // const-string v0, "build.id"
(( java.io.DataOutputStream ) v2 ).writeUTF ( v0 ); // invoke-virtual {v2, v0}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V
v0 = android.os.Build.ID;
(( java.io.DataOutputStream ) v2 ).writeUTF ( v0 ); // invoke-virtual {v2, v0}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V
final String v0 = "version.release"; // const-string v0, "version.release"
(( java.io.DataOutputStream ) v2 ).writeUTF ( v0 ); // invoke-virtual {v2, v0}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V
v0 = android.os.Build$VERSION.RELEASE;
(( java.io.DataOutputStream ) v2 ).writeUTF ( v0 ); // invoke-virtual {v2, v0}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V
final String v0 = "build.device"; // const-string v0, "build.device"
(( java.io.DataOutputStream ) v2 ).writeUTF ( v0 ); // invoke-virtual {v2, v0}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V
v0 = android.os.Build.DEVICE;
(( java.io.DataOutputStream ) v2 ).writeUTF ( v0 ); // invoke-virtual {v2, v0}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V
final String v0 = "build.product"; // const-string v0, "build.product"
(( java.io.DataOutputStream ) v2 ).writeUTF ( v0 ); // invoke-virtual {v2, v0}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V
v0 = android.os.Build.PRODUCT;
(( java.io.DataOutputStream ) v2 ).writeUTF ( v0 ); // invoke-virtual {v2, v0}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V
v3 = v0 = this.I;
(( java.io.DataOutputStream ) v2 ).writeShort ( v3 ); // invoke-virtual {v2, v3}, Ljava/io/DataOutputStream;->writeShort(I)V
/* move v4, v6 */
} // :goto_5
/* if-ge v4, v3, :cond_3 */
v0 = this.I;
/* check-cast v0, [B */
(( java.io.DataOutputStream ) v2 ).write ( v0 ); // invoke-virtual {v2, v0}, Ljava/io/DataOutputStream;->write([B)V
/* add-int/lit8 v0, v4, 0x1 */
/* move v4, v0 */
} // :cond_3
/* new-instance v0, Ljava/util/ArrayList; */
v3 = this.I;
/* invoke-direct {v0, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V */
this.D = v0;
(( java.io.DataOutputStream ) v2 ).close ( ); // invoke-virtual {v2}, Ljava/io/DataOutputStream;->close()V
(( java.io.ByteArrayOutputStream ) v1 ).toByteArray ( ); // invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
/* :try_end_6 */
/* .catch Ljava/lang/Throwable; {:try_start_6 ..:try_end_6} :catch_0 */
/* .catchall {:try_start_6 ..:try_end_6} :catchall_0 */
try { // :try_start_7
com.flurry.android.r .a ( v2 );
/* :try_end_7 */
/* .catchall {:try_start_7 ..:try_end_7} :catchall_1 */
/* goto/16 :goto_3 */
/* :catchall_2 */
/* move-exception v0 */
/* move-object v1, v7 */
/* goto/16 :goto_4 */
/* :catchall_3 */
/* move-exception v0 */
/* goto/16 :goto_4 */
/* :catch_1 */
/* move-exception v0 */
/* move-object v1, v7 */
/* goto/16 :goto_2 */
} // .end method
static com.flurry.android.u b ( ) {
/* .locals 1 */
v0 = com.flurry.android.FlurryAgent.j;
v0 = this.aa;
} // .end method
private synchronized void b ( android.content.Context p0 ) {
/* .locals 9 */
final String v0 = "FlurryAgent"; // const-string v0, "FlurryAgent"
/* monitor-enter p0 */
try { // :try_start_0
/* invoke-direct {p0, p1}, Lcom/flurry/android/FlurryAgent;->c(Landroid/content/Context;)Ljava/lang/String; */
this.F = v0;
v0 = this.u;
v0 = (( java.io.File ) v0 ).exists ( ); // invoke-virtual {v0}, Ljava/io/File;->exists()Z
if ( v0 != null) { // if-eqz v0, :cond_6
final String v0 = "FlurryAgent"; // const-string v0, "FlurryAgent"
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "loading persistent data: "; // const-string v2, "loading persistent data: "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = this.u;
(( java.io.File ) v2 ).getAbsolutePath ( ); // invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.flurry.android.ah .c ( v0,v1 );
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
int v0 = 0; // const/4 v0, 0x0
try { // :try_start_1
/* new-instance v1, Ljava/io/FileInputStream; */
v2 = this.u;
/* invoke-direct {v1, v2}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V */
/* new-instance v2, Ljava/io/DataInputStream; */
/* invoke-direct {v2, v1}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V */
/* :try_end_1 */
/* .catch Ljava/lang/Throwable; {:try_start_1 ..:try_end_1} :catch_2 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_1 */
try { // :try_start_2
v0 = (( java.io.DataInputStream ) v2 ).readUnsignedShort ( ); // invoke-virtual {v2}, Ljava/io/DataInputStream;->readUnsignedShort()I
/* const v1, 0xb5fa */
/* if-ne v0, v1, :cond_4 */
/* invoke-direct {p0, v2}, Lcom/flurry/android/FlurryAgent;->b(Ljava/io/DataInputStream;)V */
/* :try_end_2 */
/* .catch Ljava/lang/Throwable; {:try_start_2 ..:try_end_2} :catch_0 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_2 */
} // :goto_0
try { // :try_start_3
com.flurry.android.r .a ( v2 );
/* :try_end_3 */
/* .catchall {:try_start_3 ..:try_end_3} :catchall_0 */
} // :goto_1
try { // :try_start_4
/* iget-boolean v0, p0, Lcom/flurry/android/FlurryAgent;->w:Z */
/* if-nez v0, :cond_0 */
v0 = this.u;
v0 = (( java.io.File ) v0 ).delete ( ); // invoke-virtual {v0}, Ljava/io/File;->delete()Z
if ( v0 != null) { // if-eqz v0, :cond_5
final String v0 = "FlurryAgent"; // const-string v0, "FlurryAgent"
final String v1 = "Deleted persistence file"; // const-string v1, "Deleted persistence file"
com.flurry.android.ah .a ( v0,v1 );
/* :try_end_4 */
/* .catch Ljava/lang/Throwable; {:try_start_4 ..:try_end_4} :catch_1 */
/* .catchall {:try_start_4 ..:try_end_4} :catchall_0 */
} // :cond_0
} // :goto_2
try { // :try_start_5
/* iget-boolean v0, p0, Lcom/flurry/android/FlurryAgent;->w:Z */
/* if-nez v0, :cond_1 */
int v0 = 0; // const/4 v0, 0x0
/* iput-boolean v0, p0, Lcom/flurry/android/FlurryAgent;->G:Z */
/* iget-wide v0, p0, Lcom/flurry/android/FlurryAgent;->J:J */
/* iput-wide v0, p0, Lcom/flurry/android/FlurryAgent;->H:J */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/flurry/android/FlurryAgent;->w:Z */
} // :cond_1
v0 = this.F;
/* if-nez v0, :cond_2 */
java.lang.Math .random ( );
/* move-result-wide v0 */
java.lang.Double .doubleToLongBits ( v0,v1 );
/* move-result-wide v0 */
/* const-wide/16 v2, 0x25 */
java.lang.System .nanoTime ( );
/* move-result-wide v4 */
v6 = this.z;
v6 = (( java.lang.String ) v6 ).hashCode ( ); // invoke-virtual {v6}, Ljava/lang/String;->hashCode()I
/* mul-int/lit8 v6, v6, 0x25 */
/* int-to-long v6, v6 */
/* add-long/2addr v4, v6 */
/* mul-long/2addr v2, v4 */
/* add-long/2addr v0, v2 */
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "ID"; // const-string v3, "ID"
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* const/16 v3, 0x10 */
java.lang.Long .toString ( v0,v1,v3 );
(( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
this.F = v0;
final String v0 = "FlurryAgent"; // const-string v0, "FlurryAgent"
final String v1 = "Generated id"; // const-string v1, "Generated id"
com.flurry.android.ah .c ( v0,v1 );
} // :cond_2
v0 = this.aa;
v1 = this.F;
(( com.flurry.android.u ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/flurry/android/u;->a(Ljava/lang/String;)V
v0 = this.F;
final String v1 = "AND"; // const-string v1, "AND"
v0 = (( java.lang.String ) v0 ).startsWith ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
/* if-nez v0, :cond_3 */
v0 = this.t;
v0 = (( java.io.File ) v0 ).exists ( ); // invoke-virtual {v0}, Ljava/io/File;->exists()Z
/* if-nez v0, :cond_3 */
v0 = this.F;
/* invoke-direct {p0, p1, v0}, Lcom/flurry/android/FlurryAgent;->c(Landroid/content/Context;Ljava/lang/String;)V */
/* :try_end_5 */
/* .catchall {:try_start_5 ..:try_end_5} :catchall_0 */
} // :cond_3
/* monitor-exit p0 */
return;
} // :cond_4
try { // :try_start_6
final String v0 = "FlurryAgent"; // const-string v0, "FlurryAgent"
final String v1 = "Unexpected file type"; // const-string v1, "Unexpected file type"
com.flurry.android.ah .a ( v0,v1 );
/* :try_end_6 */
/* .catch Ljava/lang/Throwable; {:try_start_6 ..:try_end_6} :catch_0 */
/* .catchall {:try_start_6 ..:try_end_6} :catchall_2 */
/* goto/16 :goto_0 */
/* :catch_0 */
/* move-exception v0 */
/* move-object v1, v2 */
} // :goto_3
try { // :try_start_7
final String v2 = "FlurryAgent"; // const-string v2, "FlurryAgent"
final String v3 = "Error when loading persistent file"; // const-string v3, "Error when loading persistent file"
com.flurry.android.ah .b ( v2,v3,v0 );
/* :try_end_7 */
/* .catchall {:try_start_7 ..:try_end_7} :catchall_3 */
try { // :try_start_8
com.flurry.android.r .a ( v1 );
/* :try_end_8 */
/* .catchall {:try_start_8 ..:try_end_8} :catchall_0 */
/* goto/16 :goto_1 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
/* :catchall_1 */
/* move-exception v1 */
/* move-object v8, v1 */
/* move-object v1, v0 */
/* move-object v0, v8 */
} // :goto_4
try { // :try_start_9
com.flurry.android.r .a ( v1 );
/* throw v0 */
/* :try_end_9 */
/* .catchall {:try_start_9 ..:try_end_9} :catchall_0 */
} // :cond_5
try { // :try_start_a
final String v0 = "FlurryAgent"; // const-string v0, "FlurryAgent"
final String v1 = "Cannot delete persistence file"; // const-string v1, "Cannot delete persistence file"
com.flurry.android.ah .b ( v0,v1 );
/* :try_end_a */
/* .catch Ljava/lang/Throwable; {:try_start_a ..:try_end_a} :catch_1 */
/* .catchall {:try_start_a ..:try_end_a} :catchall_0 */
/* goto/16 :goto_2 */
/* :catch_1 */
/* move-exception v0 */
try { // :try_start_b
final String v1 = "FlurryAgent"; // const-string v1, "FlurryAgent"
final String v2 = ""; // const-string v2, ""
com.flurry.android.ah .b ( v1,v2,v0 );
/* goto/16 :goto_2 */
} // :cond_6
final String v0 = "FlurryAgent"; // const-string v0, "FlurryAgent"
final String v1 = "Agent cache file doesn\'t exist."; // const-string v1, "Agent cache file doesn\'t exist."
com.flurry.android.ah .c ( v0,v1 );
/* :try_end_b */
/* .catchall {:try_start_b ..:try_end_b} :catchall_0 */
/* goto/16 :goto_2 */
/* :catchall_2 */
/* move-exception v0 */
/* move-object v1, v2 */
/* :catchall_3 */
/* move-exception v0 */
/* :catch_2 */
/* move-exception v1 */
/* move-object v8, v1 */
/* move-object v1, v0 */
/* move-object v0, v8 */
} // .end method
private synchronized void b ( android.content.Context p0, java.lang.String p1 ) {
/* .locals 8 */
int v7 = 1; // const/4 v7, 0x1
final String v0 = " and "; // const-string v0, " and "
final String v0 = "FlurryAgent"; // const-string v0, "FlurryAgent"
/* monitor-enter p0 */
try { // :try_start_0
v0 = this.z;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.z;
v0 = (( java.lang.String ) v0 ).equals ( p2 ); // invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v0, :cond_0 */
final String v0 = "FlurryAgent"; // const-string v0, "FlurryAgent"
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "onStartSession called with different api keys: "; // const-string v2, "onStartSession called with different api keys: "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = this.z;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = " and "; // const-string v2, " and "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p2 ); // invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.flurry.android.ah .b ( v0,v1 );
} // :cond_0
v0 = this.y;
/* check-cast v0, Landroid/content/Context; */
if ( v0 != null) { // if-eqz v0, :cond_1
final String v0 = "FlurryAgent"; // const-string v0, "FlurryAgent"
final String v1 = "onStartSession called with duplicate context, use a specific Activity or Service as context instead of using a global context"; // const-string v1, "onStartSession called with duplicate context, use a specific Activity or Service as context instead of using a global context"
com.flurry.android.ah .d ( v0,v1 );
} // :cond_1
/* iget-boolean v0, p0, Lcom/flurry/android/FlurryAgent;->v:Z */
/* if-nez v0, :cond_8 */
final String v0 = "FlurryAgent"; // const-string v0, "FlurryAgent"
final String v1 = "Initializing Flurry session"; // const-string v1, "Initializing Flurry session"
com.flurry.android.ah .a ( v0,v1 );
this.z = p2;
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = ".flurryagent."; // const-string v1, ".flurryagent."
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.z;
v1 = (( java.lang.String ) v1 ).hashCode ( ); // invoke-virtual {v1}, Ljava/lang/String;->hashCode()I
/* const/16 v2, 0x10 */
java.lang.Integer .toString ( v1,v2 );
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( android.content.Context ) p1 ).getFileStreamPath ( v0 ); // invoke-virtual {p1, v0}, Landroid/content/Context;->getFileStreamPath(Ljava/lang/String;)Ljava/io/File;
this.u = v0;
final String v0 = ".flurryb."; // const-string v0, ".flurryb."
(( android.content.Context ) p1 ).getFileStreamPath ( v0 ); // invoke-virtual {p1, v0}, Landroid/content/Context;->getFileStreamPath(Ljava/lang/String;)Ljava/io/File;
this.t = v0;
/* sget-boolean v0, Lcom/flurry/android/FlurryAgent;->o:Z */
if ( v0 != null) { // if-eqz v0, :cond_2
/* new-instance v0, Lcom/flurry/android/FlurryAgent$FlurryDefaultExceptionHandler; */
/* invoke-direct {v0}, Lcom/flurry/android/FlurryAgent$FlurryDefaultExceptionHandler;-><init>()V */
java.lang.Thread .setDefaultUncaughtExceptionHandler ( v0 );
} // :cond_2
(( android.content.Context ) p1 ).getApplicationContext ( ); // invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
v1 = this.B;
/* if-nez v1, :cond_3 */
com.flurry.android.FlurryAgent .d ( v0 );
this.B = v1;
} // :cond_3
(( android.content.Context ) v0 ).getPackageName ( ); // invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
v2 = this.A;
if ( v2 != null) { // if-eqz v2, :cond_4
v2 = this.A;
v2 = (( java.lang.String ) v2 ).equals ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v2, :cond_4 */
final String v2 = "FlurryAgent"; // const-string v2, "FlurryAgent"
/* new-instance v3, Ljava/lang/StringBuilder; */
/* invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V */
final String v4 = "onStartSession called from different application packages: "; // const-string v4, "onStartSession called from different application packages: "
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v4 = this.A;
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v4 = " and "; // const-string v4, " and "
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).append ( v1 ); // invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.flurry.android.ah .b ( v2,v3 );
} // :cond_4
this.A = v1;
android.os.SystemClock .elapsedRealtime ( );
/* move-result-wide v1 */
/* iget-wide v3, p0, Lcom/flurry/android/FlurryAgent;->x:J */
/* sub-long v3, v1, v3 */
/* sget-wide v5, Lcom/flurry/android/FlurryAgent;->k:J */
/* cmp-long v3, v3, v5 */
/* if-lez v3, :cond_b */
final String v3 = "FlurryAgent"; // const-string v3, "FlurryAgent"
final String v4 = "New session"; // const-string v4, "New session"
com.flurry.android.ah .a ( v3,v4 );
java.lang.System .currentTimeMillis ( );
/* move-result-wide v3 */
/* iput-wide v3, p0, Lcom/flurry/android/FlurryAgent;->J:J */
/* iput-wide v1, p0, Lcom/flurry/android/FlurryAgent;->K:J */
/* const-wide/16 v1, -0x1 */
/* iput-wide v1, p0, Lcom/flurry/android/FlurryAgent;->L:J */
final String v1 = ""; // const-string v1, ""
this.P = v1;
int v1 = 0; // const/4 v1, 0x0
/* iput v1, p0, Lcom/flurry/android/FlurryAgent;->S:I */
int v1 = 0; // const/4 v1, 0x0
this.T = v1;
java.util.TimeZone .getDefault ( );
(( java.util.TimeZone ) v1 ).getID ( ); // invoke-virtual {v1}, Ljava/util/TimeZone;->getID()Ljava/lang/String;
this.N = v1;
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
java.util.Locale .getDefault ( );
(( java.util.Locale ) v2 ).getLanguage ( ); // invoke-virtual {v2}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = "_"; // const-string v2, "_"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
java.util.Locale .getDefault ( );
(( java.util.Locale ) v2 ).getCountry ( ); // invoke-virtual {v2}, Ljava/util/Locale;->getCountry()Ljava/lang/String;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
this.M = v1;
/* new-instance v1, Ljava/util/HashMap; */
/* invoke-direct {v1}, Ljava/util/HashMap;-><init>()V */
this.U = v1;
/* new-instance v1, Ljava/util/ArrayList; */
/* invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V */
this.V = v1;
int v1 = 1; // const/4 v1, 0x1
/* iput-boolean v1, p0, Lcom/flurry/android/FlurryAgent;->W:Z */
/* new-instance v1, Ljava/util/ArrayList; */
/* invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V */
this.Y = v1;
int v1 = 0; // const/4 v1, 0x0
/* iput v1, p0, Lcom/flurry/android/FlurryAgent;->X:I */
int v1 = 0; // const/4 v1, 0x0
/* iput v1, p0, Lcom/flurry/android/FlurryAgent;->Z:I */
/* sget-boolean v1, Lcom/flurry/android/FlurryAgent;->q:Z */
if ( v1 != null) { // if-eqz v1, :cond_6
v1 = this.aa;
v1 = (( com.flurry.android.u ) v1 ).a ( ); // invoke-virtual {v1}, Lcom/flurry/android/u;->a()Z
/* if-nez v1, :cond_5 */
final String v1 = "FlurryAgent"; // const-string v1, "FlurryAgent"
final String v2 = "Initializing AppCircle"; // const-string v2, "Initializing AppCircle"
com.flurry.android.ah .a ( v1,v2 );
/* new-instance v1, Lcom/flurry/android/a; */
/* invoke-direct {v1}, Lcom/flurry/android/a;-><init>()V */
v2 = this.z;
this.a = v2;
/* iget-wide v2, p0, Lcom/flurry/android/FlurryAgent;->H:J */
/* iput-wide v2, v1, Lcom/flurry/android/a;->b:J */
v2 = com.flurry.android.FlurryAgent.f;
if ( v2 != null) { // if-eqz v2, :cond_9
v2 = com.flurry.android.FlurryAgent.f;
} // :goto_0
this.c = v2;
v2 = com.flurry.android.FlurryAgent.h;
if ( v2 != null) { // if-eqz v2, :cond_a
v2 = com.flurry.android.FlurryAgent.h;
} // :goto_1
this.d = v2;
v2 = this.s;
this.e = v2;
v2 = this.aa;
(( com.flurry.android.u ) v2 ).a ( p1, v1 ); // invoke-virtual {v2, p1, v1}, Lcom/flurry/android/u;->a(Landroid/content/Context;Lcom/flurry/android/a;)V
final String v1 = "FlurryAgent"; // const-string v1, "FlurryAgent"
final String v2 = "AppCircle initialized"; // const-string v2, "AppCircle initialized"
com.flurry.android.ah .a ( v1,v2 );
} // :cond_5
v1 = this.aa;
/* iget-wide v2, p0, Lcom/flurry/android/FlurryAgent;->J:J */
/* iget-wide v4, p0, Lcom/flurry/android/FlurryAgent;->K:J */
(( com.flurry.android.u ) v1 ).a ( v2, v3, v4, v5 ); // invoke-virtual {v1, v2, v3, v4, v5}, Lcom/flurry/android/u;->a(JJ)V
} // :cond_6
/* iget-boolean v1, p0, Lcom/flurry/android/FlurryAgent;->C:Z */
/* new-instance v2, Lcom/flurry/android/d; */
/* invoke-direct {v2, p0, v0, v1}, Lcom/flurry/android/d;-><init>(Lcom/flurry/android/FlurryAgent;Landroid/content/Context;Z)V */
/* invoke-direct {p0, v2}, Lcom/flurry/android/FlurryAgent;->a(Ljava/lang/Runnable;)V */
} // :cond_7
} // :goto_2
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/flurry/android/FlurryAgent;->v:Z */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
} // :cond_8
/* monitor-exit p0 */
return;
} // :cond_9
try { // :try_start_1
v2 = com.flurry.android.FlurryAgent.g;
} // :cond_a
v2 = com.flurry.android.FlurryAgent.i;
} // :cond_b
final String v0 = "FlurryAgent"; // const-string v0, "FlurryAgent"
final String v1 = "Continuing previous session"; // const-string v1, "Continuing previous session"
com.flurry.android.ah .a ( v0,v1 );
v0 = v0 = this.I;
/* if-nez v0, :cond_7 */
v0 = this.I;
v1 = v1 = this.I;
/* sub-int/2addr v1, v7 */
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
static void b ( com.flurry.android.FlurryAgent p0 ) { //synthethic
/* .locals 0 */
/* invoke-direct {p0}, Lcom/flurry/android/FlurryAgent;->g()V */
return;
} // .end method
private synchronized void b ( java.io.DataInputStream p0 ) {
/* .locals 5 */
int v1 = 2; // const/4 v1, 0x2
int v4 = 0; // const/4 v4, 0x0
final String v0 = "Unknown agent file version: "; // const-string v0, "Unknown agent file version: "
final String v0 = "FlurryAgent"; // const-string v0, "FlurryAgent"
/* monitor-enter p0 */
try { // :try_start_0
v0 = (( java.io.DataInputStream ) p1 ).readUnsignedShort ( ); // invoke-virtual {p1}, Ljava/io/DataInputStream;->readUnsignedShort()I
/* if-le v0, v1, :cond_0 */
final String v1 = "FlurryAgent"; // const-string v1, "FlurryAgent"
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "Unknown agent file version: "; // const-string v3, "Unknown agent file version: "
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.flurry.android.ah .b ( v1,v2 );
/* new-instance v1, Ljava/io/IOException; */
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "Unknown agent file version: "; // const-string v3, "Unknown agent file version: "
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V */
/* throw v1 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // :cond_0
/* if-lt v0, v1, :cond_4 */
try { // :try_start_1
(( java.io.DataInputStream ) p1 ).readUTF ( ); // invoke-virtual {p1}, Ljava/io/DataInputStream;->readUTF()Ljava/lang/String;
final String v1 = "FlurryAgent"; // const-string v1, "FlurryAgent"
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "Loading API key: "; // const-string v3, "Loading API key: "
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v3 = this.z;
com.flurry.android.FlurryAgent .f ( v3 );
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.flurry.android.ah .a ( v1,v2 );
v1 = this.z;
v1 = (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_3
(( java.io.DataInputStream ) p1 ).readUTF ( ); // invoke-virtual {p1}, Ljava/io/DataInputStream;->readUTF()Ljava/lang/String;
v1 = this.F;
/* if-nez v1, :cond_1 */
final String v1 = "FlurryAgent"; // const-string v1, "FlurryAgent"
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "Loading phoneId: "; // const-string v3, "Loading phoneId: "
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.flurry.android.ah .a ( v1,v2 );
} // :cond_1
this.F = v0;
v0 = (( java.io.DataInputStream ) p1 ).readBoolean ( ); // invoke-virtual {p1}, Ljava/io/DataInputStream;->readBoolean()Z
/* iput-boolean v0, p0, Lcom/flurry/android/FlurryAgent;->G:Z */
(( java.io.DataInputStream ) p1 ).readLong ( ); // invoke-virtual {p1}, Ljava/io/DataInputStream;->readLong()J
/* move-result-wide v0 */
/* iput-wide v0, p0, Lcom/flurry/android/FlurryAgent;->H:J */
final String v0 = "FlurryAgent"; // const-string v0, "FlurryAgent"
final String v1 = "Loading session reports"; // const-string v1, "Loading session reports"
com.flurry.android.ah .a ( v0,v1 );
/* move v0, v4 */
} // :goto_0
v1 = (( java.io.DataInputStream ) p1 ).readUnsignedShort ( ); // invoke-virtual {p1}, Ljava/io/DataInputStream;->readUnsignedShort()I
if ( v1 != null) { // if-eqz v1, :cond_2
/* new-array v1, v1, [B */
(( java.io.DataInputStream ) p1 ).readFully ( v1 ); // invoke-virtual {p1, v1}, Ljava/io/DataInputStream;->readFully([B)V
v2 = this.I;
int v3 = 0; // const/4 v3, 0x0
final String v1 = "FlurryAgent"; // const-string v1, "FlurryAgent"
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "Session report added: "; // const-string v3, "Session report added: "
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* add-int/lit8 v0, v0, 0x1 */
(( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.flurry.android.ah .a ( v1,v2 );
} // :cond_2
final String v0 = "FlurryAgent"; // const-string v0, "FlurryAgent"
final String v1 = "Persistent file loaded"; // const-string v1, "Persistent file loaded"
com.flurry.android.ah .a ( v0,v1 );
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/flurry/android/FlurryAgent;->w:Z */
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
} // :goto_1
/* monitor-exit p0 */
return;
} // :cond_3
try { // :try_start_2
final String v1 = "FlurryAgent"; // const-string v1, "FlurryAgent"
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "Api keys do not match, old: "; // const-string v3, "Api keys do not match, old: "
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
com.flurry.android.FlurryAgent .f ( v0 );
(( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = ", new: "; // const-string v2, ", new: "
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = this.z;
com.flurry.android.FlurryAgent .f ( v2 );
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.flurry.android.ah .a ( v1,v0 );
} // :cond_4
final String v1 = "FlurryAgent"; // const-string v1, "FlurryAgent"
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "Deleting old file version: "; // const-string v3, "Deleting old file version: "
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.flurry.android.ah .d ( v1,v0 );
/* :try_end_2 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
} // .end method
public static void b ( java.lang.String p0 ) {
/* .locals 4 */
try { // :try_start_0
v0 = com.flurry.android.FlurryAgent.j;
int v1 = 1; // const/4 v1, 0x1
/* invoke-direct {v0, p0, v1}, Lcom/flurry/android/FlurryAgent;->a(Ljava/lang/String;Z)V */
/* :try_end_0 */
/* .catch Ljava/lang/Throwable; {:try_start_0 ..:try_end_0} :catch_0 */
} // :goto_0
return;
/* :catch_0 */
/* move-exception v0 */
final String v1 = "FlurryAgent"; // const-string v1, "FlurryAgent"
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "Failed to log event: "; // const-string v3, "Failed to log event: "
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( p0 ); // invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.flurry.android.ah .b ( v1,v2,v0 );
} // .end method
private void b ( Boolean p0 ) {
/* .locals 5 */
final String v4 = ""; // const-string v4, ""
final String v3 = "FlurryAgent"; // const-string v3, "FlurryAgent"
try { // :try_start_0
final String v0 = "FlurryAgent"; // const-string v0, "FlurryAgent"
final String v1 = "generating report"; // const-string v1, "generating report"
com.flurry.android.ah .a ( v0,v1 );
/* invoke-direct {p0, p1}, Lcom/flurry/android/FlurryAgent;->a(Z)[B */
if ( v0 != null) { // if-eqz v0, :cond_2
v0 = /* invoke-direct {p0, v0}, Lcom/flurry/android/FlurryAgent;->a([B)Z */
if ( v0 != null) { // if-eqz v0, :cond_0
final String v0 = "FlurryAgent"; // const-string v0, "FlurryAgent"
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Done sending "; // const-string v2, "Done sending "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget-boolean v2, p0, Lcom/flurry/android/FlurryAgent;->v:Z */
if ( v2 != null) { // if-eqz v2, :cond_1
final String v2 = "initial "; // const-string v2, "initial "
} // :goto_0
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = "agent report"; // const-string v2, "agent report"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.flurry.android.ah .a ( v0,v1 );
/* invoke-direct {p0}, Lcom/flurry/android/FlurryAgent;->i()V */
} // :cond_0
} // :goto_1
return;
} // :cond_1
final String v2 = ""; // const-string v2, ""
/* move-object v2, v4 */
} // :cond_2
final String v0 = "FlurryAgent"; // const-string v0, "FlurryAgent"
final String v1 = "Error generating report"; // const-string v1, "Error generating report"
com.flurry.android.ah .a ( v0,v1 );
/* :try_end_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catch Ljava/lang/Throwable; {:try_start_0 ..:try_end_0} :catch_1 */
/* :catch_0 */
/* move-exception v0 */
final String v1 = "FlurryAgent"; // const-string v1, "FlurryAgent"
final String v1 = ""; // const-string v1, ""
com.flurry.android.ah .a ( v3,v4,v0 );
/* :catch_1 */
/* move-exception v0 */
final String v1 = "FlurryAgent"; // const-string v1, "FlurryAgent"
final String v1 = ""; // const-string v1, ""
com.flurry.android.ah .b ( v3,v4,v0 );
} // .end method
static java.lang.String c ( ) {
/* .locals 1 */
v0 = com.flurry.android.FlurryAgent.j;
v0 = this.z;
} // .end method
private java.lang.String c ( android.content.Context p0 ) {
/* .locals 8 */
int v6 = 0; // const/4 v6, 0x0
int v5 = 0; // const/4 v5, 0x0
v0 = this.F;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.F;
} // :goto_0
} // :cond_0
(( android.content.Context ) p1 ).getContentResolver ( ); // invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;
final String v1 = "android_id"; // const-string v1, "android_id"
android.provider.Settings$System .getString ( v0,v1 );
if ( v0 != null) { // if-eqz v0, :cond_1
v1 = (( java.lang.String ) v0 ).length ( ); // invoke-virtual {v0}, Ljava/lang/String;->length()I
/* if-lez v1, :cond_1 */
final String v1 = "null"; // const-string v1, "null"
v1 = (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_2
} // :cond_1
/* move v1, v5 */
} // :goto_1
if ( v1 != null) { // if-eqz v1, :cond_5
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "AND"; // const-string v2, "AND"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // :cond_2
v1 = com.flurry.android.FlurryAgent.b;
/* array-length v2, v1 */
/* move v3, v5 */
} // :goto_2
/* if-ge v3, v2, :cond_4 */
/* aget-object v4, v1, v3 */
v4 = (( java.lang.String ) v0 ).equals ( v4 ); // invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v4 != null) { // if-eqz v4, :cond_3
/* move v1, v5 */
} // :cond_3
/* add-int/lit8 v3, v3, 0x1 */
} // :cond_4
int v1 = 1; // const/4 v1, 0x1
} // :cond_5
final String v0 = ".flurryb."; // const-string v0, ".flurryb."
(( android.content.Context ) p1 ).getFileStreamPath ( v0 ); // invoke-virtual {p1, v0}, Landroid/content/Context;->getFileStreamPath(Ljava/lang/String;)Ljava/io/File;
v1 = (( java.io.File ) v0 ).exists ( ); // invoke-virtual {v0}, Ljava/io/File;->exists()Z
if ( v1 != null) { // if-eqz v1, :cond_6
try { // :try_start_0
/* new-instance v1, Ljava/io/FileInputStream; */
/* invoke-direct {v1, v0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V */
/* new-instance v0, Ljava/io/DataInputStream; */
/* invoke-direct {v0, v1}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V */
/* :try_end_0 */
/* .catch Ljava/lang/Throwable; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
try { // :try_start_1
(( java.io.DataInputStream ) v0 ).readInt ( ); // invoke-virtual {v0}, Ljava/io/DataInputStream;->readInt()I
(( java.io.DataInputStream ) v0 ).readUTF ( ); // invoke-virtual {v0}, Ljava/io/DataInputStream;->readUTF()Ljava/lang/String;
/* :try_end_1 */
/* .catch Ljava/lang/Throwable; {:try_start_1 ..:try_end_1} :catch_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_1 */
com.flurry.android.r .a ( v0 );
/* move-object v0, v1 */
/* :catch_0 */
/* move-exception v0 */
/* move-object v1, v6 */
} // :goto_3
try { // :try_start_2
final String v2 = "FlurryAgent"; // const-string v2, "FlurryAgent"
final String v3 = "Error when loading b file"; // const-string v3, "Error when loading b file"
com.flurry.android.ah .b ( v2,v3,v0 );
/* :try_end_2 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_2 */
com.flurry.android.r .a ( v1 );
/* move-object v0, v6 */
/* :catchall_0 */
/* move-exception v0 */
/* move-object v1, v6 */
} // :goto_4
com.flurry.android.r .a ( v1 );
/* throw v0 */
/* :catchall_1 */
/* move-exception v1 */
/* move-object v7, v1 */
/* move-object v1, v0 */
/* move-object v0, v7 */
/* :catchall_2 */
/* move-exception v0 */
/* :catch_1 */
/* move-exception v1 */
/* move-object v7, v1 */
/* move-object v1, v0 */
/* move-object v0, v7 */
} // :cond_6
/* move-object v0, v6 */
/* goto/16 :goto_0 */
} // .end method
private synchronized void c ( android.content.Context p0, java.lang.String p1 ) {
/* .locals 5 */
/* monitor-enter p0 */
try { // :try_start_0
final String v0 = ".flurryb."; // const-string v0, ".flurryb."
(( android.content.Context ) p1 ).getFileStreamPath ( v0 ); // invoke-virtual {p1, v0}, Landroid/content/Context;->getFileStreamPath(Ljava/lang/String;)Ljava/io/File;
this.t = v0;
v0 = this.t;
com.flurry.android.FlurryAgent .a ( v0 );
/* :try_end_0 */
v0 = /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* if-nez v0, :cond_0 */
} // :goto_0
/* monitor-exit p0 */
return;
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
try { // :try_start_1
/* new-instance v1, Ljava/io/FileOutputStream; */
v2 = this.t;
/* invoke-direct {v1, v2}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V */
/* new-instance v2, Ljava/io/DataOutputStream; */
/* invoke-direct {v2, v1}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V */
/* :try_end_1 */
/* .catch Ljava/lang/Throwable; {:try_start_1 ..:try_end_1} :catch_0 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_1 */
int v0 = 1; // const/4 v0, 0x1
try { // :try_start_2
(( java.io.DataOutputStream ) v2 ).writeInt ( v0 ); // invoke-virtual {v2, v0}, Ljava/io/DataOutputStream;->writeInt(I)V
(( java.io.DataOutputStream ) v2 ).writeUTF ( p2 ); // invoke-virtual {v2, p2}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V
/* :try_end_2 */
/* .catch Ljava/lang/Throwable; {:try_start_2 ..:try_end_2} :catch_1 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_2 */
try { // :try_start_3
com.flurry.android.r .a ( v2 );
/* :try_end_3 */
/* .catchall {:try_start_3 ..:try_end_3} :catchall_0 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
/* :catch_0 */
/* move-exception v1 */
/* move-object v4, v1 */
/* move-object v1, v0 */
/* move-object v0, v4 */
} // :goto_1
try { // :try_start_4
final String v2 = "FlurryAgent"; // const-string v2, "FlurryAgent"
final String v3 = "Error when saving b file"; // const-string v3, "Error when saving b file"
com.flurry.android.ah .b ( v2,v3,v0 );
/* :try_end_4 */
/* .catchall {:try_start_4 ..:try_end_4} :catchall_3 */
try { // :try_start_5
com.flurry.android.r .a ( v1 );
/* :catchall_1 */
/* move-exception v1 */
/* move-object v4, v1 */
/* move-object v1, v0 */
/* move-object v0, v4 */
} // :goto_2
com.flurry.android.r .a ( v1 );
/* throw v0 */
/* :try_end_5 */
/* .catchall {:try_start_5 ..:try_end_5} :catchall_0 */
/* :catchall_2 */
/* move-exception v0 */
/* move-object v1, v2 */
/* :catchall_3 */
/* move-exception v0 */
/* :catch_1 */
/* move-exception v0 */
/* move-object v1, v2 */
} // .end method
static void c ( com.flurry.android.FlurryAgent p0 ) { //synthethic
/* .locals 0 */
/* invoke-direct {p0}, Lcom/flurry/android/FlurryAgent;->i()V */
return;
} // .end method
public static void c ( java.lang.String p0 ) {
/* .locals 4 */
try { // :try_start_0
v0 = com.flurry.android.FlurryAgent.j;
/* invoke-direct {v0, p0}, Lcom/flurry/android/FlurryAgent;->e(Ljava/lang/String;)V */
/* :try_end_0 */
/* .catch Ljava/lang/Throwable; {:try_start_0 ..:try_end_0} :catch_0 */
} // :goto_0
return;
/* :catch_0 */
/* move-exception v0 */
final String v1 = "FlurryAgent"; // const-string v1, "FlurryAgent"
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "Failed to signify the end of event: "; // const-string v3, "Failed to signify the end of event: "
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( p0 ); // invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.flurry.android.ah .b ( v1,v2,v0 );
} // .end method
static com.flurry.android.FlurryAgent d ( ) { //synthethic
/* .locals 1 */
v0 = com.flurry.android.FlurryAgent.j;
} // .end method
private static java.lang.String d ( android.content.Context p0 ) {
/* .locals 3 */
try { // :try_start_0
(( android.content.Context ) p0 ).getPackageManager ( ); // invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
(( android.content.Context ) p0 ).getPackageName ( ); // invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
int v2 = 0; // const/4 v2, 0x0
(( android.content.pm.PackageManager ) v0 ).getPackageInfo ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
v1 = this.versionName;
if ( v1 != null) { // if-eqz v1, :cond_0
v0 = this.versionName;
} // :goto_0
} // :cond_0
/* iget v1, v0, Landroid/content/pm/PackageInfo;->versionCode:I */
if ( v1 != null) { // if-eqz v1, :cond_1
/* iget v0, v0, Landroid/content/pm/PackageInfo;->versionCode:I */
java.lang.Integer .toString ( v0 );
/* :try_end_0 */
/* .catch Ljava/lang/Throwable; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception v0 */
final String v1 = "FlurryAgent"; // const-string v1, "FlurryAgent"
final String v2 = ""; // const-string v2, ""
com.flurry.android.ah .b ( v1,v2,v0 );
} // :cond_1
final String v0 = "Unknown"; // const-string v0, "Unknown"
} // .end method
static void d ( com.flurry.android.FlurryAgent p0 ) { //synthethic
/* .locals 5 */
int v4 = 0; // const/4 v4, 0x0
try { // :try_start_0
/* monitor-enter p0 */
/* :try_end_0 */
/* .catch Ljava/lang/Throwable; {:try_start_0 ..:try_end_0} :catch_0 */
try { // :try_start_1
android.os.SystemClock .elapsedRealtime ( );
/* move-result-wide v0 */
/* iget-wide v2, p0, Lcom/flurry/android/FlurryAgent;->x:J */
/* sub-long/2addr v0, v2 */
/* iget-boolean v2, p0, Lcom/flurry/android/FlurryAgent;->v:Z */
/* if-nez v2, :cond_1 */
/* sget-wide v2, Lcom/flurry/android/FlurryAgent;->k:J */
/* cmp-long v0, v0, v2 */
/* if-lez v0, :cond_1 */
v0 = v0 = this.I;
/* if-lez v0, :cond_1 */
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
/* monitor-exit p0 */
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 0; // const/4 v0, 0x0
try { // :try_start_2
/* invoke-direct {p0, v0}, Lcom/flurry/android/FlurryAgent;->b(Z)V */
/* :try_end_2 */
/* .catch Ljava/lang/Throwable; {:try_start_2 ..:try_end_2} :catch_0 */
} // :cond_0
} // :goto_1
return;
} // :cond_1
/* move v0, v4 */
/* :catchall_0 */
/* move-exception v0 */
try { // :try_start_3
/* monitor-exit p0 */
/* :try_end_3 */
/* .catchall {:try_start_3 ..:try_end_3} :catchall_0 */
try { // :try_start_4
/* throw v0 */
/* :try_end_4 */
/* .catch Ljava/lang/Throwable; {:try_start_4 ..:try_end_4} :catch_0 */
/* :catch_0 */
/* move-exception v0 */
final String v1 = "FlurryAgent"; // const-string v1, "FlurryAgent"
final String v2 = ""; // const-string v2, ""
com.flurry.android.ah .b ( v1,v2,v0 );
} // .end method
public static void d ( java.lang.String p0 ) {
/* .locals 3 */
try { // :try_start_0
v0 = com.flurry.android.FlurryAgent.j;
int v1 = 0; // const/4 v1, 0x0
/* invoke-direct {v0, p0, v1}, Lcom/flurry/android/FlurryAgent;->a(Ljava/lang/String;Z)V */
/* :try_end_0 */
/* .catch Ljava/lang/Throwable; {:try_start_0 ..:try_end_0} :catch_0 */
} // :goto_0
return;
/* :catch_0 */
/* move-exception v0 */
final String v1 = "FlurryAgent"; // const-string v1, "FlurryAgent"
final String v2 = ""; // const-string v2, ""
com.flurry.android.ah .b ( v1,v2,v0 );
} // .end method
static Long e ( ) { //synthethic
/* .locals 2 */
/* sget-wide v0, Lcom/flurry/android/FlurryAgent;->k:J */
/* return-wide v0 */
} // .end method
private android.location.Location e ( android.content.Context p0 ) {
/* .locals 7 */
final String v0 = "android.permission.ACCESS_FINE_LOCATION"; // const-string v0, "android.permission.ACCESS_FINE_LOCATION"
v0 = (( android.content.Context ) p1 ).checkCallingOrSelfPermission ( v0 ); // invoke-virtual {p1, v0}, Landroid/content/Context;->checkCallingOrSelfPermission(Ljava/lang/String;)I
if ( v0 != null) { // if-eqz v0, :cond_0
final String v0 = "android.permission.ACCESS_COARSE_LOCATION"; // const-string v0, "android.permission.ACCESS_COARSE_LOCATION"
v0 = (( android.content.Context ) p1 ).checkCallingOrSelfPermission ( v0 ); // invoke-virtual {p1, v0}, Landroid/content/Context;->checkCallingOrSelfPermission(Ljava/lang/String;)I
/* if-nez v0, :cond_3 */
} // :cond_0
final String v0 = "location"; // const-string v0, "location"
(( android.content.Context ) p1 ).getSystemService ( v0 ); // invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* check-cast v0, Landroid/location/LocationManager; */
/* monitor-enter p0 */
try { // :try_start_0
v1 = this.E;
/* if-nez v1, :cond_2 */
this.E = v0;
} // :goto_0
/* monitor-exit p0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
v1 = com.flurry.android.FlurryAgent.p;
/* if-nez v1, :cond_1 */
/* new-instance v1, Landroid/location/Criteria; */
/* invoke-direct {v1}, Landroid/location/Criteria;-><init>()V */
} // :cond_1
int v2 = 1; // const/4 v2, 0x1
(( android.location.LocationManager ) v0 ).getBestProvider ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/location/LocationManager;->getBestProvider(Landroid/location/Criteria;Z)Ljava/lang/String;
if ( v1 != null) { // if-eqz v1, :cond_3
/* const-wide/16 v2, 0x0 */
int v4 = 0; // const/4 v4, 0x0
android.os.Looper .getMainLooper ( );
/* move-object v5, p0 */
/* invoke-virtual/range {v0 ..v6}, Landroid/location/LocationManager;->requestLocationUpdates(Ljava/lang/String;JFLandroid/location/LocationListener;Landroid/os/Looper;)V */
(( android.location.LocationManager ) v0 ).getLastKnownLocation ( v1 ); // invoke-virtual {v0, v1}, Landroid/location/LocationManager;->getLastKnownLocation(Ljava/lang/String;)Landroid/location/Location;
} // :goto_1
} // :cond_2
try { // :try_start_1
v0 = this.E;
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* throw v0 */
} // :cond_3
int v0 = 0; // const/4 v0, 0x0
} // .end method
static android.os.Handler e ( com.flurry.android.FlurryAgent p0 ) { //synthethic
/* .locals 1 */
v0 = this.s;
} // .end method
private synchronized void e ( java.lang.String p0 ) {
/* .locals 5 */
/* monitor-enter p0 */
try { // :try_start_0
v0 = this.V;
v0 = } // :cond_0
if ( v0 != null) { // if-eqz v0, :cond_1
/* check-cast v0, Lcom/flurry/android/i; */
v2 = (( com.flurry.android.i ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lcom/flurry/android/i;->a(Ljava/lang/String;)Z
if ( v2 != null) { // if-eqz v2, :cond_0
android.os.SystemClock .elapsedRealtime ( );
/* move-result-wide v1 */
/* iget-wide v3, p0, Lcom/flurry/android/FlurryAgent;->K:J */
/* sub-long/2addr v1, v3 */
(( com.flurry.android.i ) v0 ).a ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lcom/flurry/android/i;->a(J)V
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
} // :cond_1
/* monitor-exit p0 */
return;
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
static com.flurry.android.u f ( com.flurry.android.FlurryAgent p0 ) { //synthethic
/* .locals 1 */
v0 = this.aa;
} // .end method
private static java.lang.String f ( java.lang.String p0 ) {
/* .locals 4 */
int v3 = 4; // const/4 v3, 0x4
if ( p0 != null) { // if-eqz p0, :cond_1
v0 = (( java.lang.String ) p0 ).length ( ); // invoke-virtual {p0}, Ljava/lang/String;->length()I
/* if-le v0, v3, :cond_1 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
v2 = (( java.lang.String ) p0 ).length ( ); // invoke-virtual {p0}, Ljava/lang/String;->length()I
/* sub-int/2addr v2, v3 */
/* if-ge v1, v2, :cond_0 */
/* const/16 v2, 0x2a */
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_0
v1 = (( java.lang.String ) p0 ).length ( ); // invoke-virtual {p0}, Ljava/lang/String;->length()I
/* sub-int/2addr v1, v3 */
(( java.lang.String ) p0 ).substring ( v1 ); // invoke-virtual {p0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // :goto_1
} // :cond_1
/* move-object v0, p0 */
} // .end method
static Boolean f ( ) { //synthethic
/* .locals 1 */
/* sget-boolean v0, Lcom/flurry/android/FlurryAgent;->q:Z */
} // .end method
private synchronized void g ( ) {
/* .locals 7 */
final String v4 = ""; // const-string v4, ""
/* monitor-enter p0 */
int v0 = 0; // const/4 v0, 0x0
try { // :try_start_0
/* new-instance v2, Ljava/io/ByteArrayOutputStream; */
/* invoke-direct {v2}, Ljava/io/ByteArrayOutputStream;-><init>()V */
/* new-instance v3, Ljava/io/DataOutputStream; */
/* invoke-direct {v3, v2}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V */
/* :try_end_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_1 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_2 */
int v0 = 1; // const/4 v0, 0x1
try { // :try_start_1
(( java.io.DataOutputStream ) v3 ).writeShort ( v0 ); // invoke-virtual {v3, v0}, Ljava/io/DataOutputStream;->writeShort(I)V
v0 = this.B;
(( java.io.DataOutputStream ) v3 ).writeUTF ( v0 ); // invoke-virtual {v3, v0}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V
/* iget-wide v0, p0, Lcom/flurry/android/FlurryAgent;->J:J */
(( java.io.DataOutputStream ) v3 ).writeLong ( v0, v1 ); // invoke-virtual {v3, v0, v1}, Ljava/io/DataOutputStream;->writeLong(J)V
/* iget-wide v0, p0, Lcom/flurry/android/FlurryAgent;->L:J */
(( java.io.DataOutputStream ) v3 ).writeLong ( v0, v1 ); // invoke-virtual {v3, v0, v1}, Ljava/io/DataOutputStream;->writeLong(J)V
/* const-wide/16 v0, 0x0 */
(( java.io.DataOutputStream ) v3 ).writeLong ( v0, v1 ); // invoke-virtual {v3, v0, v1}, Ljava/io/DataOutputStream;->writeLong(J)V
v0 = this.M;
(( java.io.DataOutputStream ) v3 ).writeUTF ( v0 ); // invoke-virtual {v3, v0}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V
v0 = this.N;
(( java.io.DataOutputStream ) v3 ).writeUTF ( v0 ); // invoke-virtual {v3, v0}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V
/* iget-byte v0, p0, Lcom/flurry/android/FlurryAgent;->O:B */
(( java.io.DataOutputStream ) v3 ).writeByte ( v0 ); // invoke-virtual {v3, v0}, Ljava/io/DataOutputStream;->writeByte(I)V
v0 = this.P;
/* if-nez v0, :cond_0 */
final String v0 = ""; // const-string v0, ""
/* move-object v0, v4 */
} // :goto_0
(( java.io.DataOutputStream ) v3 ).writeUTF ( v0 ); // invoke-virtual {v3, v0}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V
v0 = this.T;
/* if-nez v0, :cond_1 */
int v0 = 0; // const/4 v0, 0x0
(( java.io.DataOutputStream ) v3 ).writeBoolean ( v0 ); // invoke-virtual {v3, v0}, Ljava/io/DataOutputStream;->writeBoolean(Z)V
} // :goto_1
/* iget v0, p0, Lcom/flurry/android/FlurryAgent;->Z:I */
(( java.io.DataOutputStream ) v3 ).writeInt ( v0 ); // invoke-virtual {v3, v0}, Ljava/io/DataOutputStream;->writeInt(I)V
int v0 = -1; // const/4 v0, -0x1
(( java.io.DataOutputStream ) v3 ).writeByte ( v0 ); // invoke-virtual {v3, v0}, Ljava/io/DataOutputStream;->writeByte(I)V
int v0 = -1; // const/4 v0, -0x1
(( java.io.DataOutputStream ) v3 ).writeByte ( v0 ); // invoke-virtual {v3, v0}, Ljava/io/DataOutputStream;->writeByte(I)V
/* iget-byte v0, p0, Lcom/flurry/android/FlurryAgent;->Q:B */
(( java.io.DataOutputStream ) v3 ).writeByte ( v0 ); // invoke-virtual {v3, v0}, Ljava/io/DataOutputStream;->writeByte(I)V
v0 = this.R;
/* if-nez v0, :cond_2 */
int v0 = 0; // const/4 v0, 0x0
(( java.io.DataOutputStream ) v3 ).writeBoolean ( v0 ); // invoke-virtual {v3, v0}, Ljava/io/DataOutputStream;->writeBoolean(Z)V
} // :goto_2
v0 = v0 = this.U;
(( java.io.DataOutputStream ) v3 ).writeShort ( v0 ); // invoke-virtual {v3, v0}, Ljava/io/DataOutputStream;->writeShort(I)V
v0 = this.U;
v0 = } // :goto_3
if ( v0 != null) { // if-eqz v0, :cond_3
/* check-cast v0, Ljava/util/Map$Entry; */
/* check-cast v1, Ljava/lang/String; */
(( java.io.DataOutputStream ) v3 ).writeUTF ( v1 ); // invoke-virtual {v3, v1}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V
/* check-cast v0, Lcom/flurry/android/g; */
/* iget v0, v0, Lcom/flurry/android/g;->a:I */
(( java.io.DataOutputStream ) v3 ).writeInt ( v0 ); // invoke-virtual {v3, v0}, Ljava/io/DataOutputStream;->writeInt(I)V
/* :try_end_1 */
/* .catch Ljava/io/IOException; {:try_start_1 ..:try_end_1} :catch_0 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* :catch_0 */
/* move-exception v0 */
/* move-object v1, v3 */
} // :goto_4
try { // :try_start_2
final String v2 = "FlurryAgent"; // const-string v2, "FlurryAgent"
final String v3 = ""; // const-string v3, ""
com.flurry.android.ah .b ( v2,v3,v0 );
/* :try_end_2 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_3 */
try { // :try_start_3
com.flurry.android.r .a ( v1 );
/* :try_end_3 */
/* .catchall {:try_start_3 ..:try_end_3} :catchall_1 */
} // :goto_5
/* monitor-exit p0 */
return;
} // :cond_0
try { // :try_start_4
v0 = this.P;
} // :cond_1
int v0 = 1; // const/4 v0, 0x1
(( java.io.DataOutputStream ) v3 ).writeBoolean ( v0 ); // invoke-virtual {v3, v0}, Ljava/io/DataOutputStream;->writeBoolean(Z)V
v0 = this.T;
(( android.location.Location ) v0 ).getLatitude ( ); // invoke-virtual {v0}, Landroid/location/Location;->getLatitude()D
/* move-result-wide v0 */
com.flurry.android.FlurryAgent .a ( v0,v1 );
/* move-result-wide v0 */
(( java.io.DataOutputStream ) v3 ).writeDouble ( v0, v1 ); // invoke-virtual {v3, v0, v1}, Ljava/io/DataOutputStream;->writeDouble(D)V
v0 = this.T;
(( android.location.Location ) v0 ).getLongitude ( ); // invoke-virtual {v0}, Landroid/location/Location;->getLongitude()D
/* move-result-wide v0 */
com.flurry.android.FlurryAgent .a ( v0,v1 );
/* move-result-wide v0 */
(( java.io.DataOutputStream ) v3 ).writeDouble ( v0, v1 ); // invoke-virtual {v3, v0, v1}, Ljava/io/DataOutputStream;->writeDouble(D)V
v0 = this.T;
v0 = (( android.location.Location ) v0 ).getAccuracy ( ); // invoke-virtual {v0}, Landroid/location/Location;->getAccuracy()F
(( java.io.DataOutputStream ) v3 ).writeFloat ( v0 ); // invoke-virtual {v3, v0}, Ljava/io/DataOutputStream;->writeFloat(F)V
/* :try_end_4 */
/* .catch Ljava/io/IOException; {:try_start_4 ..:try_end_4} :catch_0 */
/* .catchall {:try_start_4 ..:try_end_4} :catchall_0 */
/* goto/16 :goto_1 */
/* :catchall_0 */
/* move-exception v0 */
/* move-object v1, v3 */
} // :goto_6
try { // :try_start_5
com.flurry.android.r .a ( v1 );
/* throw v0 */
/* :try_end_5 */
/* .catchall {:try_start_5 ..:try_end_5} :catchall_1 */
/* :catchall_1 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // :cond_2
int v0 = 1; // const/4 v0, 0x1
try { // :try_start_6
(( java.io.DataOutputStream ) v3 ).writeBoolean ( v0 ); // invoke-virtual {v3, v0}, Ljava/io/DataOutputStream;->writeBoolean(Z)V
v0 = this.R;
(( java.lang.Long ) v0 ).longValue ( ); // invoke-virtual {v0}, Ljava/lang/Long;->longValue()J
/* move-result-wide v0 */
(( java.io.DataOutputStream ) v3 ).writeLong ( v0, v1 ); // invoke-virtual {v3, v0, v1}, Ljava/io/DataOutputStream;->writeLong(J)V
/* goto/16 :goto_2 */
} // :cond_3
v0 = v0 = this.V;
(( java.io.DataOutputStream ) v3 ).writeShort ( v0 ); // invoke-virtual {v3, v0}, Ljava/io/DataOutputStream;->writeShort(I)V
v0 = this.V;
v0 = } // :goto_7
if ( v0 != null) { // if-eqz v0, :cond_4
/* check-cast v0, Lcom/flurry/android/i; */
(( com.flurry.android.i ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/flurry/android/i;->a()[B
(( java.io.DataOutputStream ) v3 ).write ( v0 ); // invoke-virtual {v3, v0}, Ljava/io/DataOutputStream;->write([B)V
} // :cond_4
/* iget-boolean v0, p0, Lcom/flurry/android/FlurryAgent;->W:Z */
(( java.io.DataOutputStream ) v3 ).writeBoolean ( v0 ); // invoke-virtual {v3, v0}, Ljava/io/DataOutputStream;->writeBoolean(Z)V
/* iget v0, p0, Lcom/flurry/android/FlurryAgent;->S:I */
(( java.io.DataOutputStream ) v3 ).writeInt ( v0 ); // invoke-virtual {v3, v0}, Ljava/io/DataOutputStream;->writeInt(I)V
v0 = v0 = this.Y;
(( java.io.DataOutputStream ) v3 ).writeShort ( v0 ); // invoke-virtual {v3, v0}, Ljava/io/DataOutputStream;->writeShort(I)V
v0 = this.Y;
v0 = } // :goto_8
if ( v0 != null) { // if-eqz v0, :cond_5
/* check-cast v0, Lcom/flurry/android/aa; */
/* iget-wide v4, v0, Lcom/flurry/android/aa;->a:J */
(( java.io.DataOutputStream ) v3 ).writeLong ( v4, v5 ); // invoke-virtual {v3, v4, v5}, Ljava/io/DataOutputStream;->writeLong(J)V
v4 = this.b;
(( java.io.DataOutputStream ) v3 ).writeUTF ( v4 ); // invoke-virtual {v3, v4}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V
v4 = this.c;
(( java.io.DataOutputStream ) v3 ).writeUTF ( v4 ); // invoke-virtual {v3, v4}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V
v0 = this.d;
(( java.io.DataOutputStream ) v3 ).writeUTF ( v0 ); // invoke-virtual {v3, v0}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V
} // :cond_5
/* sget-boolean v0, Lcom/flurry/android/FlurryAgent;->q:Z */
if ( v0 != null) { // if-eqz v0, :cond_6
v0 = this.aa;
v1 = (( com.flurry.android.u ) v0 ).f ( ); // invoke-virtual {v0}, Lcom/flurry/android/u;->f()Ljava/util/List;
(( java.io.DataOutputStream ) v3 ).writeShort ( v1 ); // invoke-virtual {v3, v1}, Ljava/io/DataOutputStream;->writeShort(I)V
v0 = } // :goto_9
if ( v0 != null) { // if-eqz v0, :cond_7
/* check-cast v0, Lcom/flurry/android/p; */
(( com.flurry.android.p ) v0 ).a ( v3 ); // invoke-virtual {v0, v3}, Lcom/flurry/android/p;->a(Ljava/io/DataOutput;)V
} // :cond_6
int v0 = 0; // const/4 v0, 0x0
(( java.io.DataOutputStream ) v3 ).writeShort ( v0 ); // invoke-virtual {v3, v0}, Ljava/io/DataOutputStream;->writeShort(I)V
} // :cond_7
v0 = this.I;
(( java.io.ByteArrayOutputStream ) v2 ).toByteArray ( ); // invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
/* :try_end_6 */
/* .catch Ljava/io/IOException; {:try_start_6 ..:try_end_6} :catch_0 */
/* .catchall {:try_start_6 ..:try_end_6} :catchall_0 */
try { // :try_start_7
com.flurry.android.r .a ( v3 );
/* :try_end_7 */
/* .catchall {:try_start_7 ..:try_end_7} :catchall_1 */
/* goto/16 :goto_5 */
/* :catchall_2 */
/* move-exception v1 */
/* move-object v6, v1 */
/* move-object v1, v0 */
/* move-object v0, v6 */
/* goto/16 :goto_6 */
/* :catchall_3 */
/* move-exception v0 */
/* goto/16 :goto_6 */
/* :catch_1 */
/* move-exception v1 */
/* move-object v6, v1 */
/* move-object v1, v0 */
/* move-object v0, v6 */
/* goto/16 :goto_4 */
} // .end method
private static java.lang.String h ( ) {
/* .locals 1 */
v0 = com.flurry.android.FlurryAgent.c;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = com.flurry.android.FlurryAgent.c;
} // :goto_0
} // :cond_0
/* sget-boolean v0, Lcom/flurry/android/FlurryAgent;->n:Z */
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = com.flurry.android.FlurryAgent.d;
} // :cond_1
/* sget-boolean v0, Lcom/flurry/android/FlurryAgent;->m:Z */
if ( v0 != null) { // if-eqz v0, :cond_2
v0 = com.flurry.android.FlurryAgent.e;
} // :cond_2
v0 = com.flurry.android.FlurryAgent.d;
} // .end method
private synchronized void i ( ) {
/* .locals 6 */
int v2 = 0; // const/4 v2, 0x0
final String v0 = "FlurryAgent"; // const-string v0, "FlurryAgent"
/* monitor-enter p0 */
try { // :try_start_0
v0 = this.u;
com.flurry.android.FlurryAgent .a ( v0 );
/* :try_end_0 */
/* .catch Ljava/lang/Throwable; {:try_start_0 ..:try_end_0} :catch_0 */
v0 = /* .catchall {:try_start_0 ..:try_end_0} :catchall_1 */
/* if-nez v0, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
try { // :try_start_1
com.flurry.android.r .a ( v0 );
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
} // :goto_0
/* monitor-exit p0 */
return;
} // :cond_0
try { // :try_start_2
/* new-instance v0, Ljava/io/FileOutputStream; */
v1 = this.u;
/* invoke-direct {v0, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V */
/* new-instance v1, Ljava/io/DataOutputStream; */
/* invoke-direct {v1, v0}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V */
/* :try_end_2 */
/* .catch Ljava/lang/Throwable; {:try_start_2 ..:try_end_2} :catch_0 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_1 */
/* const v0, 0xb5fa */
try { // :try_start_3
(( java.io.DataOutputStream ) v1 ).writeShort ( v0 ); // invoke-virtual {v1, v0}, Ljava/io/DataOutputStream;->writeShort(I)V
int v0 = 2; // const/4 v0, 0x2
(( java.io.DataOutputStream ) v1 ).writeShort ( v0 ); // invoke-virtual {v1, v0}, Ljava/io/DataOutputStream;->writeShort(I)V
v0 = this.z;
(( java.io.DataOutputStream ) v1 ).writeUTF ( v0 ); // invoke-virtual {v1, v0}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V
v0 = this.F;
(( java.io.DataOutputStream ) v1 ).writeUTF ( v0 ); // invoke-virtual {v1, v0}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V
/* iget-boolean v0, p0, Lcom/flurry/android/FlurryAgent;->G:Z */
(( java.io.DataOutputStream ) v1 ).writeBoolean ( v0 ); // invoke-virtual {v1, v0}, Ljava/io/DataOutputStream;->writeBoolean(Z)V
/* iget-wide v2, p0, Lcom/flurry/android/FlurryAgent;->H:J */
(( java.io.DataOutputStream ) v1 ).writeLong ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/io/DataOutputStream;->writeLong(J)V
v0 = v0 = this.I;
int v2 = 1; // const/4 v2, 0x1
/* sub-int/2addr v0, v2 */
/* move v2, v0 */
} // :goto_1
/* if-ltz v2, :cond_1 */
v0 = this.I;
/* check-cast v0, [B */
/* array-length v3, v0 */
/* add-int/lit8 v4, v3, 0x2 */
v5 = (( java.io.DataOutputStream ) v1 ).size ( ); // invoke-virtual {v1}, Ljava/io/DataOutputStream;->size()I
/* add-int/2addr v4, v5 */
/* const v5, 0xc350 */
/* if-le v4, v5, :cond_2 */
final String v0 = "FlurryAgent"; // const-string v0, "FlurryAgent"
/* new-instance v3, Ljava/lang/StringBuilder; */
/* invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V */
final String v4 = "discarded sessions: "; // const-string v4, "discarded sessions: "
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).append ( v2 ); // invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.flurry.android.ah .a ( v0,v2 );
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
(( java.io.DataOutputStream ) v1 ).writeShort ( v0 ); // invoke-virtual {v1, v0}, Ljava/io/DataOutputStream;->writeShort(I)V
/* :try_end_3 */
/* .catch Ljava/lang/Throwable; {:try_start_3 ..:try_end_3} :catch_1 */
/* .catchall {:try_start_3 ..:try_end_3} :catchall_2 */
try { // :try_start_4
com.flurry.android.r .a ( v1 );
/* :try_end_4 */
/* .catchall {:try_start_4 ..:try_end_4} :catchall_0 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // :cond_2
try { // :try_start_5
(( java.io.DataOutputStream ) v1 ).writeShort ( v3 ); // invoke-virtual {v1, v3}, Ljava/io/DataOutputStream;->writeShort(I)V
(( java.io.DataOutputStream ) v1 ).write ( v0 ); // invoke-virtual {v1, v0}, Ljava/io/DataOutputStream;->write([B)V
/* :try_end_5 */
/* .catch Ljava/lang/Throwable; {:try_start_5 ..:try_end_5} :catch_1 */
/* .catchall {:try_start_5 ..:try_end_5} :catchall_2 */
/* add-int/lit8 v0, v2, -0x1 */
/* move v2, v0 */
/* :catch_0 */
/* move-exception v0 */
/* move-object v1, v2 */
} // :goto_2
try { // :try_start_6
final String v2 = "FlurryAgent"; // const-string v2, "FlurryAgent"
final String v3 = ""; // const-string v3, ""
com.flurry.android.ah .b ( v2,v3,v0 );
/* :try_end_6 */
/* .catchall {:try_start_6 ..:try_end_6} :catchall_2 */
try { // :try_start_7
com.flurry.android.r .a ( v1 );
/* goto/16 :goto_0 */
/* :catchall_1 */
/* move-exception v0 */
/* move-object v1, v2 */
} // :goto_3
com.flurry.android.r .a ( v1 );
/* throw v0 */
/* :try_end_7 */
/* .catchall {:try_start_7 ..:try_end_7} :catchall_0 */
/* :catchall_2 */
/* move-exception v0 */
/* :catch_1 */
/* move-exception v0 */
} // .end method
private synchronized void j ( ) {
/* .locals 1 */
/* monitor-enter p0 */
try { // :try_start_0
v0 = this.E;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.E;
(( android.location.LocationManager ) v0 ).removeUpdates ( p0 ); // invoke-virtual {v0, p0}, Landroid/location/LocationManager;->removeUpdates(Landroid/location/LocationListener;)V
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
} // :cond_0
/* monitor-exit p0 */
return;
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
/* # virtual methods */
final void a ( java.lang.Throwable p0 ) {
/* .locals 5 */
final String v4 = ""; // const-string v4, ""
(( java.lang.Throwable ) p1 ).printStackTrace ( ); // invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V
final String v0 = ""; // const-string v0, ""
(( java.lang.Throwable ) p1 ).getStackTrace ( ); // invoke-virtual {p1}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;
if ( v0 != null) { // if-eqz v0, :cond_1
/* array-length v1, v0 */
/* if-lez v1, :cond_1 */
int v1 = 0; // const/4 v1, 0x0
/* aget-object v0, v0, v1 */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StackTraceElement ) v0 ).getClassName ( ); // invoke-virtual {v0}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v3 = "."; // const-string v3, "."
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StackTraceElement ) v0 ).getMethodName ( ); // invoke-virtual {v0}, Ljava/lang/StackTraceElement;->getMethodName()Ljava/lang/String;
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v3 = ":"; // const-string v3, ":"
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v0 = (( java.lang.StackTraceElement ) v0 ).getLineNumber ( ); // invoke-virtual {v0}, Ljava/lang/StackTraceElement;->getLineNumber()I
(( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.Throwable ) p1 ).getMessage ( ); // invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;
if ( v0 != null) { // if-eqz v0, :cond_0
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = " ("; // const-string v2, " ("
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.Throwable ) p1 ).getMessage ( ); // invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = ")"; // const-string v2, ")"
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
} // :cond_0
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // :goto_0
(( java.lang.Object ) p1 ).getClass ( ); // invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
(( java.lang.Class ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/Class;->toString()Ljava/lang/String;
final String v2 = "uncaught"; // const-string v2, "uncaught"
try { // :try_start_0
v3 = com.flurry.android.FlurryAgent.j;
/* invoke-direct {v3, v2, v0, v1}, Lcom/flurry/android/FlurryAgent;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V */
/* :try_end_0 */
/* .catch Ljava/lang/Throwable; {:try_start_0 ..:try_end_0} :catch_0 */
} // :goto_1
v0 = this.y;
int v0 = 0; // const/4 v0, 0x0
int v1 = 1; // const/4 v1, 0x1
/* invoke-direct {p0, v0, v1}, Lcom/flurry/android/FlurryAgent;->a(Landroid/content/Context;Z)V */
return;
} // :cond_1
(( java.lang.Throwable ) p1 ).getMessage ( ); // invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;
if ( v0 != null) { // if-eqz v0, :cond_2
(( java.lang.Throwable ) p1 ).getMessage ( ); // invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;
/* :catch_0 */
/* move-exception v0 */
final String v1 = "FlurryAgent"; // const-string v1, "FlurryAgent"
final String v2 = ""; // const-string v2, ""
com.flurry.android.ah .b ( v1,v4,v0 );
} // :cond_2
/* move-object v0, v4 */
} // .end method
public synchronized final void onLocationChanged ( android.location.Location p0 ) {
/* .locals 3 */
/* monitor-enter p0 */
try { // :try_start_0
this.T = p1;
/* invoke-direct {p0}, Lcom/flurry/android/FlurryAgent;->j()V */
/* :try_end_0 */
/* .catch Ljava/lang/Throwable; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
} // :goto_0
/* monitor-exit p0 */
return;
/* :catch_0 */
/* move-exception v0 */
try { // :try_start_1
final String v1 = "FlurryAgent"; // const-string v1, "FlurryAgent"
final String v2 = ""; // const-string v2, ""
com.flurry.android.ah .b ( v1,v2,v0 );
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
public final void onProviderDisabled ( java.lang.String p0 ) {
/* .locals 0 */
return;
} // .end method
public final void onProviderEnabled ( java.lang.String p0 ) {
/* .locals 0 */
return;
} // .end method
public final void onStatusChanged ( java.lang.String p0, Integer p1, android.os.Bundle p2 ) {
/* .locals 0 */
return;
} // .end method
