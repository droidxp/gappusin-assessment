public class com.acv.a.Gb {
	 /* # static fields */
	 public static final java.lang.String a;
	 /* # instance fields */
	 private Integer b;
	 private Integer c;
	 private java.lang.String d;
	 private Boolean e;
	 private Long f;
	 private java.lang.String g;
	 private Long h;
	 private Long i;
	 /* # direct methods */
	 static com.acv.a.Gb ( ) {
		 /* .locals 1 */
		 /* const-class v0, Lcom/acv/a/Gb; */
		 (( java.lang.Class ) v0 ).getSimpleName ( ); // invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
		 return;
	 } // .end method
	 public com.acv.a.Gb ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* invoke-direct {p0, v0}, Lcom/acv/a/Gb;-><init>(I)V */
		 return;
	 } // .end method
	 public com.acv.a.Gb ( ) {
		 /* .locals 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* iput p1, p0, Lcom/acv/a/Gb;->c:I */
		 int v0 = 1; // const/4 v0, 0x1
		 /* iput v0, p0, Lcom/acv/a/Gb;->b:I */
		 return;
	 } // .end method
	 public static com.acv.a.Gb a ( Object[] p0 ) {
		 /* .locals 3 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* if-nez p0, :cond_1 */
	 } // :cond_0
} // :goto_0
} // :cond_1
try { // :try_start_0
com.acv.a.Cc .a ( p0 );
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* if-nez v1, :cond_2 */
if ( v1 != null) { // if-eqz v1, :cond_0
	 try { // :try_start_1
		 (( java.io.DataInputStream ) v1 ).close ( ); // invoke-virtual {v1}, Ljava/io/DataInputStream;->close()V
		 /* :try_end_1 */
		 /* .catch Ljava/io/IOException; {:try_start_1 ..:try_end_1} :catch_0 */
		 /* :catch_0 */
		 /* move-exception v1 */
	 } // :cond_2
	 try { // :try_start_2
		 /* new-instance v0, Lcom/acv/a/Gb; */
		 /* invoke-direct {v0}, Lcom/acv/a/Gb;-><init>()V */
		 (( com.acv.a.Gb ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/acv/a/Gb;->a(Ljava/io/DataInputStream;)V
		 /* :try_end_2 */
		 /* .catchall {:try_start_2 ..:try_end_2} :catchall_1 */
		 if ( v1 != null) { // if-eqz v1, :cond_0
			 try { // :try_start_3
				 (( java.io.DataInputStream ) v1 ).close ( ); // invoke-virtual {v1}, Ljava/io/DataInputStream;->close()V
				 /* :try_end_3 */
				 /* .catch Ljava/io/IOException; {:try_start_3 ..:try_end_3} :catch_1 */
				 /* :catch_1 */
				 /* move-exception v1 */
				 /* :catchall_0 */
				 /* move-exception v1 */
				 /* move-object v2, v1 */
				 /* move-object v1, v0 */
				 /* move-object v0, v2 */
			 } // :goto_1
			 if ( v1 != null) { // if-eqz v1, :cond_3
				 try { // :try_start_4
					 (( java.io.DataInputStream ) v1 ).close ( ); // invoke-virtual {v1}, Ljava/io/DataInputStream;->close()V
					 /* :try_end_4 */
					 /* .catch Ljava/io/IOException; {:try_start_4 ..:try_end_4} :catch_2 */
				 } // :cond_3
			 } // :goto_2
			 /* throw v0 */
			 /* :catch_2 */
			 /* move-exception v1 */
			 /* :catchall_1 */
			 /* move-exception v0 */
		 } // .end method
		 /* # virtual methods */
		 public Integer a ( ) {
			 /* .locals 1 */
			 /* iget v0, p0, Lcom/acv/a/Gb;->c:I */
		 } // .end method
		 public void a ( Integer p0 ) {
			 /* .locals 0 */
			 /* iput p1, p0, Lcom/acv/a/Gb;->c:I */
			 return;
		 } // .end method
		 public void a ( Integer p0, java.lang.String p1, java.lang.String p2 ) {
			 /* .locals 0 */
			 (( com.acv.a.Gb ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lcom/acv/a/Gb;->a(I)V
			 (( com.acv.a.Gb ) p0 ).a ( p2 ); // invoke-virtual {p0, p2}, Lcom/acv/a/Gb;->a(Ljava/lang/String;)V
			 (( com.acv.a.Gb ) p0 ).b ( p3 ); // invoke-virtual {p0, p3}, Lcom/acv/a/Gb;->b(Ljava/lang/String;)V
			 return;
		 } // .end method
		 public void a ( Long p0 ) {
			 /* .locals 0 */
			 /* iput-wide p1, p0, Lcom/acv/a/Gb;->f:J */
			 return;
		 } // .end method
		 public void a ( java.io.DataInputStream p0 ) {
			 /* .locals 2 */
			 v0 = 			 (( java.io.DataInputStream ) p1 ).readInt ( ); // invoke-virtual {p1}, Ljava/io/DataInputStream;->readInt()I
			 /* iput v0, p0, Lcom/acv/a/Gb;->b:I */
			 v0 = 			 (( java.io.DataInputStream ) p1 ).readInt ( ); // invoke-virtual {p1}, Ljava/io/DataInputStream;->readInt()I
			 /* iput v0, p0, Lcom/acv/a/Gb;->c:I */
			 (( java.io.DataInputStream ) p1 ).readUTF ( ); // invoke-virtual {p1}, Ljava/io/DataInputStream;->readUTF()Ljava/lang/String;
			 this.d = v0;
			 v0 = 			 (( java.io.DataInputStream ) p1 ).readBoolean ( ); // invoke-virtual {p1}, Ljava/io/DataInputStream;->readBoolean()Z
			 /* iput-boolean v0, p0, Lcom/acv/a/Gb;->e:Z */
			 (( java.io.DataInputStream ) p1 ).readLong ( ); // invoke-virtual {p1}, Ljava/io/DataInputStream;->readLong()J
			 /* move-result-wide v0 */
			 /* iput-wide v0, p0, Lcom/acv/a/Gb;->f:J */
			 (( java.io.DataInputStream ) p1 ).readUTF ( ); // invoke-virtual {p1}, Ljava/io/DataInputStream;->readUTF()Ljava/lang/String;
			 this.g = v0;
			 (( java.io.DataInputStream ) p1 ).readLong ( ); // invoke-virtual {p1}, Ljava/io/DataInputStream;->readLong()J
			 /* move-result-wide v0 */
			 /* iput-wide v0, p0, Lcom/acv/a/Gb;->h:J */
			 (( java.io.DataInputStream ) p1 ).readLong ( ); // invoke-virtual {p1}, Ljava/io/DataInputStream;->readLong()J
			 /* move-result-wide v0 */
			 /* iput-wide v0, p0, Lcom/acv/a/Gb;->i:J */
			 return;
		 } // .end method
		 public void a ( java.io.DataOutputStream p0 ) {
			 /* .locals 2 */
			 int v0 = 1; // const/4 v0, 0x1
			 (( java.io.DataOutputStream ) p1 ).writeInt ( v0 ); // invoke-virtual {p1, v0}, Ljava/io/DataOutputStream;->writeInt(I)V
			 /* iget v0, p0, Lcom/acv/a/Gb;->c:I */
			 (( java.io.DataOutputStream ) p1 ).writeInt ( v0 ); // invoke-virtual {p1, v0}, Ljava/io/DataOutputStream;->writeInt(I)V
			 v0 = this.d;
			 final String v1 = "unknown"; // const-string v1, "unknown"
			 com.acv.a.Cc .a ( v0,v1 );
			 (( java.io.DataOutputStream ) p1 ).writeUTF ( v0 ); // invoke-virtual {p1, v0}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V
			 /* iget-boolean v0, p0, Lcom/acv/a/Gb;->e:Z */
			 (( java.io.DataOutputStream ) p1 ).writeBoolean ( v0 ); // invoke-virtual {p1, v0}, Ljava/io/DataOutputStream;->writeBoolean(Z)V
			 /* iget-wide v0, p0, Lcom/acv/a/Gb;->f:J */
			 (( java.io.DataOutputStream ) p1 ).writeLong ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Ljava/io/DataOutputStream;->writeLong(J)V
			 v0 = this.g;
			 final String v1 = "unknown"; // const-string v1, "unknown"
			 com.acv.a.Cc .a ( v0,v1 );
			 (( java.io.DataOutputStream ) p1 ).writeUTF ( v0 ); // invoke-virtual {p1, v0}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V
			 /* iget-wide v0, p0, Lcom/acv/a/Gb;->h:J */
			 (( java.io.DataOutputStream ) p1 ).writeLong ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Ljava/io/DataOutputStream;->writeLong(J)V
			 /* iget-wide v0, p0, Lcom/acv/a/Gb;->i:J */
			 (( java.io.DataOutputStream ) p1 ).writeLong ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Ljava/io/DataOutputStream;->writeLong(J)V
			 return;
		 } // .end method
		 public void a ( java.lang.String p0 ) {
			 /* .locals 0 */
			 this.d = p1;
			 return;
		 } // .end method
		 public void a ( Boolean p0 ) {
			 /* .locals 0 */
			 /* iput-boolean p1, p0, Lcom/acv/a/Gb;->e:Z */
			 return;
		 } // .end method
		 public void b ( Long p0 ) {
			 /* .locals 0 */
			 /* iput-wide p1, p0, Lcom/acv/a/Gb;->h:J */
			 return;
		 } // .end method
		 public void b ( java.io.DataOutputStream p0 ) {
			 /* .locals 2 */
			 /* iget v0, p0, Lcom/acv/a/Gb;->c:I */
			 (( java.io.DataOutputStream ) p1 ).writeInt ( v0 ); // invoke-virtual {p1, v0}, Ljava/io/DataOutputStream;->writeInt(I)V
			 v0 = this.d;
			 final String v1 = "unknown"; // const-string v1, "unknown"
			 com.acv.a.Cc .a ( v0,v1 );
			 (( java.io.DataOutputStream ) p1 ).writeUTF ( v0 ); // invoke-virtual {p1, v0}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V
			 v0 = this.g;
			 final String v1 = "unknown"; // const-string v1, "unknown"
			 com.acv.a.Cc .a ( v0,v1 );
			 (( java.io.DataOutputStream ) p1 ).writeUTF ( v0 ); // invoke-virtual {p1, v0}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V
			 /* iget-wide v0, p0, Lcom/acv/a/Gb;->h:J */
			 (( java.io.DataOutputStream ) p1 ).writeLong ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Ljava/io/DataOutputStream;->writeLong(J)V
			 /* iget-wide v0, p0, Lcom/acv/a/Gb;->i:J */
			 (( java.io.DataOutputStream ) p1 ).writeLong ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Ljava/io/DataOutputStream;->writeLong(J)V
			 return;
		 } // .end method
		 public void b ( java.lang.String p0 ) {
			 /* .locals 0 */
			 this.g = p1;
			 return;
		 } // .end method
		 public Boolean b ( ) {
			 /* .locals 1 */
			 /* iget-boolean v0, p0, Lcom/acv/a/Gb;->e:Z */
		 } // .end method
		 public Long c ( ) {
			 /* .locals 2 */
			 /* iget-wide v0, p0, Lcom/acv/a/Gb;->f:J */
			 /* return-wide v0 */
		 } // .end method
		 public void c ( Long p0 ) {
			 /* .locals 0 */
			 /* iput-wide p1, p0, Lcom/acv/a/Gb;->i:J */
			 return;
		 } // .end method
		 public java.lang.String d ( ) {
			 /* .locals 1 */
			 v0 = this.g;
		 } // .end method
		 public Long e ( ) {
			 /* .locals 2 */
			 /* iget-wide v0, p0, Lcom/acv/a/Gb;->h:J */
			 /* return-wide v0 */
		 } // .end method
		 public Long f ( ) {
			 /* .locals 2 */
			 /* iget-wide v0, p0, Lcom/acv/a/Gb;->i:J */
			 /* return-wide v0 */
		 } // .end method
		 public java.lang.String toString ( ) {
			 /* .locals 5 */
			 final String v0 = "MilkConfig"; // const-string v0, "MilkConfig"
			 /* const/16 v1, 0x8 */
			 /* new-array v1, v1, [Ljava/lang/Object; */
			 int v2 = 0; // const/4 v2, 0x0
			 /* iget v3, p0, Lcom/acv/a/Gb;->b:I */
			 java.lang.Integer .valueOf ( v3 );
			 /* aput-object v3, v1, v2 */
			 int v2 = 1; // const/4 v2, 0x1
			 /* iget v3, p0, Lcom/acv/a/Gb;->c:I */
			 java.lang.Integer .valueOf ( v3 );
			 /* aput-object v3, v1, v2 */
			 int v2 = 2; // const/4 v2, 0x2
			 v3 = this.d;
			 /* aput-object v3, v1, v2 */
			 int v2 = 3; // const/4 v2, 0x3
			 /* iget-boolean v3, p0, Lcom/acv/a/Gb;->e:Z */
			 java.lang.Boolean .valueOf ( v3 );
			 /* aput-object v3, v1, v2 */
			 int v2 = 4; // const/4 v2, 0x4
			 /* iget-wide v3, p0, Lcom/acv/a/Gb;->f:J */
			 java.lang.Long .valueOf ( v3,v4 );
			 /* aput-object v3, v1, v2 */
			 int v2 = 5; // const/4 v2, 0x5
			 v3 = this.g;
			 /* aput-object v3, v1, v2 */
			 int v2 = 6; // const/4 v2, 0x6
			 /* iget-wide v3, p0, Lcom/acv/a/Gb;->h:J */
			 java.lang.Long .valueOf ( v3,v4 );
			 /* aput-object v3, v1, v2 */
			 int v2 = 7; // const/4 v2, 0x7
			 /* iget-wide v3, p0, Lcom/acv/a/Gb;->i:J */
			 java.lang.Long .valueOf ( v3,v4 );
			 /* aput-object v3, v1, v2 */
			 com.acv.a.Cc .a ( v0,v1 );
		 } // .end method
