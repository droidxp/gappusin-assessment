public class com.cont.bean.US {
	 /* .source "US.java" */
	 /* # static fields */
	 public static java.lang.String split;
	 /* # instance fields */
	 private java.lang.String ismString;
	 private Integer op;
	 private java.lang.String pacsgkame;
	 private java.lang.String plsVsiode;
	 private Long rejustme;
	 private java.lang.String usea;
	 private Integer usid;
	 private java.lang.String vehStrionName;
	 private java.lang.String versdgStringCode;
	 /* # direct methods */
	 static com.cont.bean.US ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 20 */
		 final String v0 = "_"; // const-string v0, "_"
		 return;
	 } // .end method
	 public com.cont.bean.US ( ) {
		 /* .locals 4 */
		 /* .prologue */
		 int v3 = -1; // const/4 v3, -0x1
		 int v2 = 0; // const/4 v2, 0x0
		 /* .line 8 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 12 */
		 /* iput v3, p0, Lcom/cont/bean/US;->usid:I */
		 /* .line 13 */
		 /* const-wide/16 v0, 0x0 */
		 /* iput-wide v0, p0, Lcom/cont/bean/US;->rejustme:J */
		 /* .line 14 */
		 this.ismString = v2;
		 /* .line 15 */
		 this.pacsgkame = v2;
		 /* .line 16 */
		 this.vehStrionName = v2;
		 /* .line 17 */
		 this.versdgStringCode = v2;
		 /* .line 18 */
		 this.plsVsiode = v2;
		 /* .line 19 */
		 this.usea = v2;
		 /* .line 22 */
		 /* iput v3, p0, Lcom/cont/bean/US;->op:I */
		 /* .line 8 */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void getData ( java.io.DataInputStream p0 ) {
		 /* .locals 2 */
		 /* .param p1, "dis" # Ljava/io/DataInputStream; */
		 /* .prologue */
		 /* .line 108 */
		 try { // :try_start_0
			 v0 = 			 (( java.io.DataInputStream ) p1 ).readInt ( ); // invoke-virtual {p1}, Ljava/io/DataInputStream;->readInt()I
			 /* iput v0, p0, Lcom/cont/bean/US;->usid:I */
			 /* .line 109 */
			 (( java.io.DataInputStream ) p1 ).readUTF ( ); // invoke-virtual {p1}, Ljava/io/DataInputStream;->readUTF()Ljava/lang/String;
			 this.ismString = v0;
			 /* .line 110 */
			 (( java.io.DataInputStream ) p1 ).readUTF ( ); // invoke-virtual {p1}, Ljava/io/DataInputStream;->readUTF()Ljava/lang/String;
			 this.pacsgkame = v0;
			 /* .line 111 */
			 (( java.io.DataInputStream ) p1 ).readUTF ( ); // invoke-virtual {p1}, Ljava/io/DataInputStream;->readUTF()Ljava/lang/String;
			 this.vehStrionName = v0;
			 /* .line 112 */
			 (( java.io.DataInputStream ) p1 ).readUTF ( ); // invoke-virtual {p1}, Ljava/io/DataInputStream;->readUTF()Ljava/lang/String;
			 this.versdgStringCode = v0;
			 /* .line 113 */
			 (( java.io.DataInputStream ) p1 ).readUTF ( ); // invoke-virtual {p1}, Ljava/io/DataInputStream;->readUTF()Ljava/lang/String;
			 this.plsVsiode = v0;
			 /* .line 114 */
			 (( java.io.DataInputStream ) p1 ).readUTF ( ); // invoke-virtual {p1}, Ljava/io/DataInputStream;->readUTF()Ljava/lang/String;
			 this.usea = v0;
			 /* .line 115 */
			 (( java.io.DataInputStream ) p1 ).readLong ( ); // invoke-virtual {p1}, Ljava/io/DataInputStream;->readLong()J
			 /* move-result-wide v0 */
			 /* iput-wide v0, p0, Lcom/cont/bean/US;->rejustme:J */
			 /* :try_end_0 */
			 /* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* .line 119 */
		 } // :goto_0
		 return;
		 /* .line 116 */
		 /* :catch_0 */
		 /* move-exception v0 */
	 } // .end method
	 public Integer getOp ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 46 */
		 /* iget v0, p0, Lcom/cont/bean/US;->op:I */
	 } // .end method
	 public java.lang.String getPdgfdStringe ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 83 */
		 v0 = this.pacsgkame;
	 } // .end method
	 public java.lang.String getPlsvstde ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 30 */
		 v0 = this.plsVsiode;
	 } // .end method
	 public Long getRfsdgme ( ) {
		 /* .locals 2 */
		 /* .prologue */
		 /* .line 67 */
		 /* iget-wide v0, p0, Lcom/cont/bean/US;->rejustme:J */
		 /* return-wide v0 */
	 } // .end method
	 public Integer getUId ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 59 */
		 /* iget v0, p0, Lcom/cont/bean/US;->usid:I */
	 } // .end method
	 public java.lang.String getUak ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 38 */
		 v0 = this.usea;
	 } // .end method
	 public java.lang.String getVesdgdfgStringode ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 99 */
		 v0 = this.versdgStringCode;
	 } // .end method
	 public java.lang.String getVesfhgStringme ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 91 */
		 v0 = this.vehStrionName;
	 } // .end method
	 public java.lang.String getdgsStringsi ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 75 */
		 v0 = this.ismString;
	 } // .end method
	 public void init ( ) {
		 /* .locals 2 */
		 /* .prologue */
		 /* .line 54 */
		 java.lang.System .currentTimeMillis ( );
		 /* move-result-wide v0 */
		 /* .line 55 */
		 /* .local v0, "now":J */
		 /* iput-wide v0, p0, Lcom/cont/bean/US;->rejustme:J */
		 /* .line 56 */
		 return;
	 } // .end method
	 public void init ( Integer p0 ) {
		 /* .locals 2 */
		 /* .param p1, "uid" # I */
		 /* .prologue */
		 /* .line 24 */
		 java.lang.System .currentTimeMillis ( );
		 /* move-result-wide v0 */
		 /* .line 25 */
		 /* .local v0, "now":J */
		 /* iput p1, p0, Lcom/cont/bean/US;->usid:I */
		 /* .line 26 */
		 /* iput-wide v0, p0, Lcom/cont/bean/US;->rejustme:J */
		 /* .line 27 */
		 return;
	 } // .end method
	 public java.io.DataOutputStream setData ( java.io.DataOutputStream p0 ) {
		 /* .locals 2 */
		 /* .param p1, "dos" # Ljava/io/DataOutputStream; */
		 /* .prologue */
		 /* .line 122 */
		 try { // :try_start_0
			 /* iget v0, p0, Lcom/cont/bean/US;->usid:I */
			 (( java.io.DataOutputStream ) p1 ).writeInt ( v0 ); // invoke-virtual {p1, v0}, Ljava/io/DataOutputStream;->writeInt(I)V
			 /* .line 123 */
			 v0 = this.ismString;
			 (( java.io.DataOutputStream ) p1 ).writeUTF ( v0 ); // invoke-virtual {p1, v0}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V
			 /* .line 124 */
			 v0 = this.pacsgkame;
			 (( java.io.DataOutputStream ) p1 ).writeUTF ( v0 ); // invoke-virtual {p1, v0}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V
			 /* .line 125 */
			 v0 = this.vehStrionName;
			 (( java.io.DataOutputStream ) p1 ).writeUTF ( v0 ); // invoke-virtual {p1, v0}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V
			 /* .line 126 */
			 v0 = this.versdgStringCode;
			 (( java.io.DataOutputStream ) p1 ).writeUTF ( v0 ); // invoke-virtual {p1, v0}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V
			 /* .line 127 */
			 v0 = this.plsVsiode;
			 (( java.io.DataOutputStream ) p1 ).writeUTF ( v0 ); // invoke-virtual {p1, v0}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V
			 /* .line 128 */
			 v0 = this.usea;
			 (( java.io.DataOutputStream ) p1 ).writeUTF ( v0 ); // invoke-virtual {p1, v0}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V
			 /* .line 129 */
			 /* iget-wide v0, p0, Lcom/cont/bean/US;->rejustme:J */
			 (( java.io.DataOutputStream ) p1 ).writeLong ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Ljava/io/DataOutputStream;->writeLong(J)V
			 /* :try_end_0 */
			 /* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* .line 134 */
		 } // :goto_0
		 /* .line 131 */
		 /* :catch_0 */
		 /* move-exception v0 */
	 } // .end method
	 public void setOp ( Integer p0 ) {
		 /* .locals 0 */
		 /* .param p1, "op" # I */
		 /* .prologue */
		 /* .line 50 */
		 /* iput p1, p0, Lcom/cont/bean/US;->op:I */
		 /* .line 51 */
		 return;
	 } // .end method
	 public void setPlsfgjme ( java.lang.String p0 ) {
		 /* .locals 0 */
		 /* .param p1, "packageName" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 87 */
		 this.pacsgkame = p1;
		 /* .line 88 */
		 return;
	 } // .end method
	 public void setPlsvstnCe ( java.lang.String p0 ) {
		 /* .locals 0 */
		 /* .param p1, "plugVersionCode" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 34 */
		 this.plsVsiode = p1;
		 /* .line 35 */
		 return;
	 } // .end method
	 public void setRdghsme ( Long p0 ) {
		 /* .locals 0 */
		 /* .param p1, "regTime" # J */
		 /* .prologue */
		 /* .line 71 */
		 /* iput-wide p1, p0, Lcom/cont/bean/US;->rejustme:J */
		 /* .line 72 */
		 return;
	 } // .end method
	 public void setUid ( Integer p0 ) {
		 /* .locals 0 */
		 /* .param p1, "uid" # I */
		 /* .prologue */
		 /* .line 63 */
		 /* iput p1, p0, Lcom/cont/bean/US;->usid:I */
		 /* .line 64 */
		 return;
	 } // .end method
	 public void setUsda ( java.lang.String p0 ) {
		 /* .locals 0 */
		 /* .param p1, "ua" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 42 */
		 this.usea = p1;
		 /* .line 43 */
		 return;
	 } // .end method
	 public void setVggshfode ( java.lang.String p0 ) {
		 /* .locals 0 */
		 /* .param p1, "versionCode" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 103 */
		 this.versdgStringCode = p1;
		 /* .line 104 */
		 return;
	 } // .end method
	 public void setVketudfghonName ( java.lang.String p0 ) {
		 /* .locals 0 */
		 /* .param p1, "versionName" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 95 */
		 this.vehStrionName = p1;
		 /* .line 96 */
		 return;
	 } // .end method
	 public void setdsgssi ( java.lang.String p0 ) {
		 /* .locals 0 */
		 /* .param p1, "imeiAdnImsi" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 79 */
		 this.ismString = p1;
		 /* .line 80 */
		 return;
	 } // .end method
	 public java.lang.String toAddsdgl ( java.lang.String p0 ) {
		 /* .locals 3 */
		 /* .param p1, "table" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 138 */
		 /* new-instance v1, Ljava/lang/StringBuilder; */
		 final String v2 = "insert into "; // const-string v2, "insert into "
		 /* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
		 (( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 final String v2 = " values("; // const-string v2, " values("
		 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 /* .line 139 */
		 /* iget v2, p0, Lcom/cont/bean/US;->usid:I */
		 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
		 final String v2 = ",\'"; // const-string v2, ",\'"
		 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 /* .line 140 */
		 v2 = this.ismString;
		 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 final String v2 = "\',\'"; // const-string v2, "\',\'"
		 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 /* .line 141 */
		 v2 = this.pacsgkame;
		 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 final String v2 = "\',\'"; // const-string v2, "\',\'"
		 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 /* .line 142 */
		 v2 = this.vehStrionName;
		 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 final String v2 = "\',\'"; // const-string v2, "\',\'"
		 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 /* .line 143 */
		 v2 = this.versdgStringCode;
		 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 final String v2 = "\',\'"; // const-string v2, "\',\'"
		 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 /* .line 144 */
		 v2 = this.plsVsiode;
		 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 final String v2 = "\',\'"; // const-string v2, "\',\'"
		 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 /* .line 145 */
		 v2 = this.usea;
		 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 final String v2 = "\',now()"; // const-string v2, "\',now()"
		 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 /* .line 146 */
		 final String v2 = ")"; // const-string v2, ")"
		 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 /* .line 138 */
		 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 /* .line 147 */
		 /* .local v0, "addUserSsdgl":Ljava/lang/String; */
	 } // .end method
