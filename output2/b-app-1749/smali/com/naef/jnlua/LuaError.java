class com.naef.jnlua.LuaError {
	 /* # instance fields */
	 private java.lang.Throwable cause;
	 private com.naef.jnlua.LuaStackTraceElement luaStackTrace;
	 private java.lang.String message;
	 /* # direct methods */
	 public com.naef.jnlua.LuaError ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 this.message = p1;
		 this.cause = p2;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public java.lang.Throwable getCause ( ) {
		 /* .locals 1 */
		 v0 = this.cause;
	 } // .end method
	 public com.naef.jnlua.LuaStackTraceElement getLuaStackTrace ( ) {
		 /* .locals 1 */
		 v0 = this.luaStackTrace;
	 } // .end method
	 public java.lang.String getMessage ( ) {
		 /* .locals 1 */
		 v0 = this.message;
	 } // .end method
	 void setLuaStackTrace ( com.naef.jnlua.LuaStackTraceElement[] p0 ) {
		 /* .locals 0 */
		 this.luaStackTrace = p1;
		 return;
	 } // .end method
	 public java.lang.String toString ( ) {
		 /* .locals 2 */
		 /* new-instance v0, Ljava/lang/StringBuffer; */
		 /* invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V */
		 v1 = this.message;
		 if ( v1 != null) { // if-eqz v1, :cond_0
			 v1 = this.message;
			 (( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
		 } // :cond_0
		 v1 = this.cause;
		 if ( v1 != null) { // if-eqz v1, :cond_1
			 v1 = this.cause;
			 (( java.lang.Throwable ) v1 ).getMessage ( ); // invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;
			 if ( v1 != null) { // if-eqz v1, :cond_1
				 v1 = this.cause;
				 (( java.lang.Throwable ) v1 ).getMessage ( ); // invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;
				 (( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
			 } // :cond_1
			 (( java.lang.StringBuffer ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
		 } // .end method
