public class org.haxe.nme.HaxeObject {
	 /* .source "HaxeObject.java" */
	 /* # instance fields */
	 public Long __haxeHandle;
	 /* # direct methods */
	 public org.haxe.nme.HaxeObject ( ) {
		 /* .locals 0 */
		 /* .param p1, "value" # J */
		 /* .prologue */
		 /* .line 18 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 19 */
		 /* iput-wide p1, p0, Lorg/haxe/nme/HaxeObject;->__haxeHandle:J */
		 /* .line 20 */
		 return;
	 } // .end method
	 public static org.haxe.nme.HaxeObject create ( Long p0 ) {
		 /* .locals 1 */
		 /* .param p0, "inHandle" # J */
		 /* .prologue */
		 /* .line 22 */
		 /* new-instance v0, Lorg/haxe/nme/HaxeObject; */
		 /* invoke-direct {v0, p0, p1}, Lorg/haxe/nme/HaxeObject;-><init>(J)V */
	 } // .end method
	 /* # virtual methods */
	 public java.lang.Object call ( java.lang.String p0, java.lang.Object[] p1 ) {
		 /* .locals 2 */
		 /* .param p1, "function" # Ljava/lang/String; */
		 /* .param p2, "args" # [Ljava/lang/Object; */
		 /* .prologue */
		 /* .line 108 */
		 /* iget-wide v0, p0, Lorg/haxe/nme/HaxeObject;->__haxeHandle:J */
		 org.haxe.nme.NME .callObjectFunction ( v0,v1,p1,p2 );
	 } // .end method
	 public java.lang.Object call0 ( java.lang.String p0 ) {
		 /* .locals 3 */
		 /* .param p1, "function" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 35 */
		 /* iget-wide v0, p0, Lorg/haxe/nme/HaxeObject;->__haxeHandle:J */
		 int v2 = 0; // const/4 v2, 0x0
		 /* new-array v2, v2, [Ljava/lang/Object; */
		 org.haxe.nme.NME .callObjectFunction ( v0,v1,p1,v2 );
	 } // .end method
	 public java.lang.Object call1 ( java.lang.String p0, java.lang.Object p1 ) {
		 /* .locals 3 */
		 /* .param p1, "function" # Ljava/lang/String; */
		 /* .param p2, "arg0" # Ljava/lang/Object; */
		 /* .prologue */
		 /* .line 39 */
		 int v1 = 1; // const/4 v1, 0x1
		 /* new-array v0, v1, [Ljava/lang/Object; */
		 /* .line 40 */
		 /* .local v0, "args":[Ljava/lang/Object; */
		 int v1 = 0; // const/4 v1, 0x0
		 /* aput-object p2, v0, v1 */
		 /* .line 42 */
		 /* iget-wide v1, p0, Lorg/haxe/nme/HaxeObject;->__haxeHandle:J */
		 org.haxe.nme.NME .callObjectFunction ( v1,v2,p1,v0 );
	 } // .end method
	 public java.lang.Object call2 ( java.lang.String p0, java.lang.Object p1, java.lang.Object p2 ) {
		 /* .locals 3 */
		 /* .param p1, "function" # Ljava/lang/String; */
		 /* .param p2, "arg0" # Ljava/lang/Object; */
		 /* .param p3, "arg1" # Ljava/lang/Object; */
		 /* .prologue */
		 /* .line 46 */
		 int v1 = 2; // const/4 v1, 0x2
		 /* new-array v0, v1, [Ljava/lang/Object; */
		 /* .line 47 */
		 /* .local v0, "args":[Ljava/lang/Object; */
		 int v1 = 0; // const/4 v1, 0x0
		 /* aput-object p2, v0, v1 */
		 /* .line 48 */
		 int v1 = 1; // const/4 v1, 0x1
		 /* aput-object p3, v0, v1 */
		 /* .line 50 */
		 /* iget-wide v1, p0, Lorg/haxe/nme/HaxeObject;->__haxeHandle:J */
		 org.haxe.nme.NME .callObjectFunction ( v1,v2,p1,v0 );
	 } // .end method
	 public java.lang.Object call3 ( java.lang.String p0, java.lang.Object p1, java.lang.Object p2, java.lang.Object p3 ) {
		 /* .locals 3 */
		 /* .param p1, "function" # Ljava/lang/String; */
		 /* .param p2, "arg0" # Ljava/lang/Object; */
		 /* .param p3, "arg1" # Ljava/lang/Object; */
		 /* .param p4, "arg2" # Ljava/lang/Object; */
		 /* .prologue */
		 /* .line 54 */
		 int v1 = 3; // const/4 v1, 0x3
		 /* new-array v0, v1, [Ljava/lang/Object; */
		 /* .line 55 */
		 /* .local v0, "args":[Ljava/lang/Object; */
		 int v1 = 0; // const/4 v1, 0x0
		 /* aput-object p2, v0, v1 */
		 /* .line 56 */
		 int v1 = 1; // const/4 v1, 0x1
		 /* aput-object p3, v0, v1 */
		 /* .line 57 */
		 int v1 = 2; // const/4 v1, 0x2
		 /* aput-object p4, v0, v1 */
		 /* .line 59 */
		 /* iget-wide v1, p0, Lorg/haxe/nme/HaxeObject;->__haxeHandle:J */
		 org.haxe.nme.NME .callObjectFunction ( v1,v2,p1,v0 );
	 } // .end method
	 public java.lang.Object call4 ( java.lang.String p0, java.lang.Object p1, java.lang.Object p2, java.lang.Object p3, java.lang.Object p4 ) {
		 /* .locals 3 */
		 /* .param p1, "function" # Ljava/lang/String; */
		 /* .param p2, "arg0" # Ljava/lang/Object; */
		 /* .param p3, "arg1" # Ljava/lang/Object; */
		 /* .param p4, "arg2" # Ljava/lang/Object; */
		 /* .param p5, "arg3" # Ljava/lang/Object; */
		 /* .prologue */
		 /* .line 63 */
		 int v1 = 4; // const/4 v1, 0x4
		 /* new-array v0, v1, [Ljava/lang/Object; */
		 /* .line 64 */
		 /* .local v0, "args":[Ljava/lang/Object; */
		 int v1 = 0; // const/4 v1, 0x0
		 /* aput-object p2, v0, v1 */
		 /* .line 65 */
		 int v1 = 1; // const/4 v1, 0x1
		 /* aput-object p3, v0, v1 */
		 /* .line 66 */
		 int v1 = 2; // const/4 v1, 0x2
		 /* aput-object p4, v0, v1 */
		 /* .line 67 */
		 int v1 = 3; // const/4 v1, 0x3
		 /* aput-object p5, v0, v1 */
		 /* .line 69 */
		 /* iget-wide v1, p0, Lorg/haxe/nme/HaxeObject;->__haxeHandle:J */
		 org.haxe.nme.NME .callObjectFunction ( v1,v2,p1,v0 );
	 } // .end method
	 public Double callD ( java.lang.String p0, java.lang.Object[] p1 ) {
		 /* .locals 2 */
		 /* .param p1, "function" # Ljava/lang/String; */
		 /* .param p2, "args" # [Ljava/lang/Object; */
		 /* .prologue */
		 /* .line 112 */
		 /* iget-wide v0, p0, Lorg/haxe/nme/HaxeObject;->__haxeHandle:J */
		 org.haxe.nme.NME .callNumericFunction ( v0,v1,p1,p2 );
		 /* move-result-wide v0 */
		 /* return-wide v0 */
	 } // .end method
	 public Double callD0 ( java.lang.String p0 ) {
		 /* .locals 3 */
		 /* .param p1, "function" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 75 */
		 /* iget-wide v0, p0, Lorg/haxe/nme/HaxeObject;->__haxeHandle:J */
		 int v2 = 0; // const/4 v2, 0x0
		 /* new-array v2, v2, [Ljava/lang/Object; */
		 org.haxe.nme.NME .callNumericFunction ( v0,v1,p1,v2 );
		 /* move-result-wide v0 */
		 /* return-wide v0 */
	 } // .end method
	 public Double callD1 ( java.lang.String p0, java.lang.Object p1 ) {
		 /* .locals 3 */
		 /* .param p1, "function" # Ljava/lang/String; */
		 /* .param p2, "arg0" # Ljava/lang/Object; */
		 /* .prologue */
		 /* .line 79 */
		 int v1 = 1; // const/4 v1, 0x1
		 /* new-array v0, v1, [Ljava/lang/Object; */
		 /* .line 80 */
		 /* .local v0, "args":[Ljava/lang/Object; */
		 int v1 = 0; // const/4 v1, 0x0
		 /* aput-object p2, v0, v1 */
		 /* .line 82 */
		 /* iget-wide v1, p0, Lorg/haxe/nme/HaxeObject;->__haxeHandle:J */
		 org.haxe.nme.NME .callNumericFunction ( v1,v2,p1,v0 );
		 /* move-result-wide v1 */
		 /* return-wide v1 */
	 } // .end method
	 public Double callD2 ( java.lang.String p0, java.lang.Object p1, java.lang.Object p2 ) {
		 /* .locals 3 */
		 /* .param p1, "function" # Ljava/lang/String; */
		 /* .param p2, "arg0" # Ljava/lang/Object; */
		 /* .param p3, "arg1" # Ljava/lang/Object; */
		 /* .prologue */
		 /* .line 86 */
		 int v1 = 2; // const/4 v1, 0x2
		 /* new-array v0, v1, [Ljava/lang/Object; */
		 /* .line 87 */
		 /* .local v0, "args":[Ljava/lang/Object; */
		 int v1 = 0; // const/4 v1, 0x0
		 /* aput-object p2, v0, v1 */
		 /* .line 88 */
		 int v1 = 1; // const/4 v1, 0x1
		 /* aput-object p3, v0, v1 */
		 /* .line 90 */
		 /* iget-wide v1, p0, Lorg/haxe/nme/HaxeObject;->__haxeHandle:J */
		 org.haxe.nme.NME .callNumericFunction ( v1,v2,p1,v0 );
		 /* move-result-wide v1 */
		 /* return-wide v1 */
	 } // .end method
	 public Double callD3 ( java.lang.String p0, java.lang.Object p1, java.lang.Object p2, java.lang.Object p3 ) {
		 /* .locals 3 */
		 /* .param p1, "function" # Ljava/lang/String; */
		 /* .param p2, "arg0" # Ljava/lang/Object; */
		 /* .param p3, "arg1" # Ljava/lang/Object; */
		 /* .param p4, "arg2" # Ljava/lang/Object; */
		 /* .prologue */
		 int v2 = 2; // const/4 v2, 0x2
		 /* .line 94 */
		 /* new-array v0, v2, [Ljava/lang/Object; */
		 /* .line 95 */
		 /* .local v0, "args":[Ljava/lang/Object; */
		 int v1 = 0; // const/4 v1, 0x0
		 /* aput-object p2, v0, v1 */
		 /* .line 96 */
		 int v1 = 1; // const/4 v1, 0x1
		 /* aput-object p3, v0, v1 */
		 /* .line 97 */
		 /* aput-object p4, v0, v2 */
		 /* .line 99 */
		 /* iget-wide v1, p0, Lorg/haxe/nme/HaxeObject;->__haxeHandle:J */
		 org.haxe.nme.NME .callNumericFunction ( v1,v2,p1,v0 );
		 /* move-result-wide v1 */
		 /* return-wide v1 */
	 } // .end method
	 protected void finalize ( ) {
		 /* .locals 2 */
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Ljava/lang/Throwable; */
		 /* } */
	 } // .end annotation
	 /* .prologue */
	 /* .line 27 */
	 try { // :try_start_0
		 /* iget-wide v0, p0, Lorg/haxe/nme/HaxeObject;->__haxeHandle:J */
		 org.haxe.nme.NME .releaseReference ( v0,v1 );
		 /* :try_end_0 */
		 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
		 /* .line 29 */
		 /* invoke-super {p0}, Ljava/lang/Object;->finalize()V */
		 /* .line 31 */
		 return;
		 /* .line 29 */
		 /* :catchall_0 */
		 /* move-exception v0 */
		 /* invoke-super {p0}, Ljava/lang/Object;->finalize()V */
		 /* throw v0 */
	 } // .end method
