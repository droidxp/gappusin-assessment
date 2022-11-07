public class com.naef.jnlua.LuaRuntimeException extends com.naef.jnlua.LuaException {
	 /* # static fields */
	 private static final com.naef.jnlua.LuaStackTraceElement EMPTY_LUA_STACK_TRACE;
	 private static final Long serialVersionUID;
	 /* # instance fields */
	 private com.naef.jnlua.LuaStackTraceElement luaStackTrace;
	 /* # direct methods */
	 static com.naef.jnlua.LuaRuntimeException ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* new-array v0, v0, [Lcom/naef/jnlua/LuaStackTraceElement; */
		 return;
	 } // .end method
	 public com.naef.jnlua.LuaRuntimeException ( ) {
		 /* .locals 1 */
		 /* invoke-direct {p0, p1}, Lcom/naef/jnlua/LuaException;-><init>(Ljava/lang/String;)V */
		 v0 = com.naef.jnlua.LuaRuntimeException.EMPTY_LUA_STACK_TRACE;
		 this.luaStackTrace = v0;
		 return;
	 } // .end method
	 public com.naef.jnlua.LuaRuntimeException ( ) {
		 /* .locals 1 */
		 /* invoke-direct {p0, p1, p2}, Lcom/naef/jnlua/LuaException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V */
		 v0 = com.naef.jnlua.LuaRuntimeException.EMPTY_LUA_STACK_TRACE;
		 this.luaStackTrace = v0;
		 return;
	 } // .end method
	 public com.naef.jnlua.LuaRuntimeException ( ) {
		 /* .locals 1 */
		 /* invoke-direct {p0, p1}, Lcom/naef/jnlua/LuaException;-><init>(Ljava/lang/Throwable;)V */
		 v0 = com.naef.jnlua.LuaRuntimeException.EMPTY_LUA_STACK_TRACE;
		 this.luaStackTrace = v0;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public com.naef.jnlua.LuaStackTraceElement getLuaStackTrace ( ) {
		 /* .locals 1 */
		 v0 = this.luaStackTrace;
		 (( com.naef.jnlua.LuaStackTraceElement ) v0 ).clone ( ); // invoke-virtual {v0}, [Lcom/naef/jnlua/LuaStackTraceElement;->clone()Ljava/lang/Object;
		 /* check-cast v0, [Lcom/naef/jnlua/LuaStackTraceElement; */
	 } // .end method
	 public void printLuaStackTrace ( ) {
		 /* .locals 1 */
		 v0 = java.lang.System.err;
		 (( com.naef.jnlua.LuaRuntimeException ) p0 ).printLuaStackTrace ( v0 ); // invoke-virtual {p0, v0}, Lcom/naef/jnlua/LuaRuntimeException;->printLuaStackTrace(Ljava/io/PrintStream;)V
		 return;
	 } // .end method
	 public void printLuaStackTrace ( java.io.PrintStream p0 ) {
		 /* .locals 3 */
		 /* monitor-enter p1 */
		 try { // :try_start_0
			 (( java.io.PrintStream ) p1 ).println ( p0 ); // invoke-virtual {p1, p0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V
			 int v0 = 0; // const/4 v0, 0x0
		 } // :goto_0
		 v1 = this.luaStackTrace;
		 /* array-length v1, v1 */
		 /* if-ge v0, v1, :cond_0 */
		 /* new-instance v1, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
		 final String v2 = "\tat "; // const-string v2, "\tat "
		 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 v2 = this.luaStackTrace;
		 /* aget-object v2, v2, v0 */
		 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 (( java.io.PrintStream ) p1 ).println ( v1 ); // invoke-virtual {p1, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
		 /* add-int/lit8 v0, v0, 0x1 */
	 } // :cond_0
	 /* monitor-exit p1 */
	 return;
	 /* :catchall_0 */
	 /* move-exception v0 */
	 /* monitor-exit p1 */
	 /* :try_end_0 */
	 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
	 /* throw v0 */
} // .end method
public void printLuaStackTrace ( java.io.PrintWriter p0 ) {
	 /* .locals 3 */
	 /* monitor-enter p1 */
	 try { // :try_start_0
		 (( java.io.PrintWriter ) p1 ).println ( p0 ); // invoke-virtual {p1, p0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
	 v1 = this.luaStackTrace;
	 /* array-length v1, v1 */
	 /* if-ge v0, v1, :cond_0 */
	 /* new-instance v1, Ljava/lang/StringBuilder; */
	 /* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
	 final String v2 = "\tat "; // const-string v2, "\tat "
	 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 v2 = this.luaStackTrace;
	 /* aget-object v2, v2, v0 */
	 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 (( java.io.PrintWriter ) p1 ).println ( v1 ); // invoke-virtual {p1, v1}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V
	 /* add-int/lit8 v0, v0, 0x1 */
} // :cond_0
/* monitor-exit p1 */
return;
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p1 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw v0 */
} // .end method
void setLuaError ( com.naef.jnlua.LuaError p0 ) {
/* .locals 1 */
(( com.naef.jnlua.LuaError ) p1 ).getCause ( ); // invoke-virtual {p1}, Lcom/naef/jnlua/LuaError;->getCause()Ljava/lang/Throwable;
(( com.naef.jnlua.LuaRuntimeException ) p0 ).initCause ( v0 ); // invoke-virtual {p0, v0}, Lcom/naef/jnlua/LuaRuntimeException;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;
(( com.naef.jnlua.LuaError ) p1 ).getLuaStackTrace ( ); // invoke-virtual {p1}, Lcom/naef/jnlua/LuaError;->getLuaStackTrace()[Lcom/naef/jnlua/LuaStackTraceElement;
this.luaStackTrace = v0;
return;
} // .end method
