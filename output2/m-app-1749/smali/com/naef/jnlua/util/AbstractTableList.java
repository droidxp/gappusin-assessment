public abstract class com.naef.jnlua.util.AbstractTableList extends java.util.AbstractList implements java.util.RandomAccess implements com.naef.jnlua.LuaValueProxy {
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/AbstractList", */
	 /* "<", */
	 /* "Ljava/lang/Object;", */
	 /* ">;", */
	 /* "Ljava/util/RandomAccess;", */
	 /* "Lcom/naef/jnlua/LuaValueProxy;" */
	 /* } */
} // .end annotation
/* # direct methods */
public com.naef.jnlua.util.AbstractTableList ( ) {
	 /* .locals 0 */
	 /* invoke-direct {p0}, Ljava/util/AbstractList;-><init>()V */
	 return;
} // .end method
/* # virtual methods */
public void add ( Integer p0, java.lang.Object p1 ) {
	 /* .locals 5 */
	 (( com.naef.jnlua.util.AbstractTableList ) p0 ).getLuaState ( ); // invoke-virtual {p0}, Lcom/naef/jnlua/util/AbstractTableList;->getLuaState()Lcom/naef/jnlua/LuaState;
	 /* monitor-enter v1 */
	 try { // :try_start_0
		 v0 = 		 (( com.naef.jnlua.util.AbstractTableList ) p0 ).size ( ); // invoke-virtual {p0}, Lcom/naef/jnlua/util/AbstractTableList;->size()I
		 /* if-ltz p1, :cond_0 */
		 /* if-le p1, v0, :cond_1 */
	 } // :cond_0
	 /* new-instance v2, Ljava/lang/IndexOutOfBoundsException; */
	 /* new-instance v3, Ljava/lang/StringBuilder; */
	 /* invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V */
	 final String v4 = "index: "; // const-string v4, "index: "
	 (( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v3 ).append ( p1 ); // invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
	 final String v4 = ", size: "; // const-string v4, ", size: "
	 (( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v3 ).append ( v0 ); // invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 /* invoke-direct {v2, v0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V */
	 /* throw v2 */
	 /* :catchall_0 */
	 /* move-exception v0 */
	 /* monitor-exit v1 */
	 /* :try_end_0 */
	 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
	 /* throw v0 */
} // :cond_1
try { // :try_start_1
	 (( com.naef.jnlua.util.AbstractTableList ) p0 ).pushValue ( ); // invoke-virtual {p0}, Lcom/naef/jnlua/util/AbstractTableList;->pushValue()V
	 int v2 = -1; // const/4 v2, -0x1
	 /* add-int/lit8 v3, p1, 0x1 */
	 /* add-int/lit8 v4, p1, 0x2 */
	 /* sub-int/2addr v0, p1 */
	 (( com.naef.jnlua.LuaState ) v1 ).tableMove ( v2, v3, v4, v0 ); // invoke-virtual {v1, v2, v3, v4, v0}, Lcom/naef/jnlua/LuaState;->tableMove(IIII)V
	 (( com.naef.jnlua.LuaState ) v1 ).pushJavaObject ( p2 ); // invoke-virtual {v1, p2}, Lcom/naef/jnlua/LuaState;->pushJavaObject(Ljava/lang/Object;)V
	 int v0 = -2; // const/4 v0, -0x2
	 /* add-int/lit8 v2, p1, 0x1 */
	 (( com.naef.jnlua.LuaState ) v1 ).rawSet ( v0, v2 ); // invoke-virtual {v1, v0, v2}, Lcom/naef/jnlua/LuaState;->rawSet(II)V
	 int v0 = 1; // const/4 v0, 0x1
	 (( com.naef.jnlua.LuaState ) v1 ).pop ( v0 ); // invoke-virtual {v1, v0}, Lcom/naef/jnlua/LuaState;->pop(I)V
	 /* monitor-exit v1 */
	 /* :try_end_1 */
	 /* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
	 return;
} // .end method
public java.lang.Object get ( Integer p0 ) {
	 /* .locals 5 */
	 (( com.naef.jnlua.util.AbstractTableList ) p0 ).getLuaState ( ); // invoke-virtual {p0}, Lcom/naef/jnlua/util/AbstractTableList;->getLuaState()Lcom/naef/jnlua/LuaState;
	 /* monitor-enter v1 */
	 try { // :try_start_0
		 v0 = 		 (( com.naef.jnlua.util.AbstractTableList ) p0 ).size ( ); // invoke-virtual {p0}, Lcom/naef/jnlua/util/AbstractTableList;->size()I
		 /* if-ltz p1, :cond_0 */
		 /* if-lt p1, v0, :cond_1 */
	 } // :cond_0
	 /* new-instance v2, Ljava/lang/IndexOutOfBoundsException; */
	 /* new-instance v3, Ljava/lang/StringBuilder; */
	 /* invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V */
	 final String v4 = "index: "; // const-string v4, "index: "
	 (( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v3 ).append ( p1 ); // invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
	 final String v4 = ", size: "; // const-string v4, ", size: "
	 (( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v3 ).append ( v0 ); // invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 /* invoke-direct {v2, v0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V */
	 /* throw v2 */
	 /* :catchall_0 */
	 /* move-exception v0 */
	 /* monitor-exit v1 */
	 /* :try_end_0 */
	 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
	 /* throw v0 */
} // :cond_1
try { // :try_start_1
	 (( com.naef.jnlua.util.AbstractTableList ) p0 ).pushValue ( ); // invoke-virtual {p0}, Lcom/naef/jnlua/util/AbstractTableList;->pushValue()V
	 int v0 = -1; // const/4 v0, -0x1
	 /* add-int/lit8 v2, p1, 0x1 */
	 (( com.naef.jnlua.LuaState ) v1 ).rawGet ( v0, v2 ); // invoke-virtual {v1, v0, v2}, Lcom/naef/jnlua/LuaState;->rawGet(II)V
	 /* :try_end_1 */
	 /* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
	 int v0 = -1; // const/4 v0, -0x1
	 try { // :try_start_2
		 /* const-class v2, Ljava/lang/Object; */
		 (( com.naef.jnlua.LuaState ) v1 ).toJavaObject ( v0, v2 ); // invoke-virtual {v1, v0, v2}, Lcom/naef/jnlua/LuaState;->toJavaObject(ILjava/lang/Class;)Ljava/lang/Object;
		 /* :try_end_2 */
		 /* .catchall {:try_start_2 ..:try_end_2} :catchall_1 */
		 int v2 = 2; // const/4 v2, 0x2
		 try { // :try_start_3
			 (( com.naef.jnlua.LuaState ) v1 ).pop ( v2 ); // invoke-virtual {v1, v2}, Lcom/naef/jnlua/LuaState;->pop(I)V
			 /* monitor-exit v1 */
			 /* :catchall_1 */
			 /* move-exception v0 */
			 int v2 = 2; // const/4 v2, 0x2
			 (( com.naef.jnlua.LuaState ) v1 ).pop ( v2 ); // invoke-virtual {v1, v2}, Lcom/naef/jnlua/LuaState;->pop(I)V
			 /* throw v0 */
			 /* :try_end_3 */
			 /* .catchall {:try_start_3 ..:try_end_3} :catchall_0 */
		 } // .end method
		 public java.lang.Object remove ( Integer p0 ) {
			 /* .locals 7 */
			 (( com.naef.jnlua.util.AbstractTableList ) p0 ).getLuaState ( ); // invoke-virtual {p0}, Lcom/naef/jnlua/util/AbstractTableList;->getLuaState()Lcom/naef/jnlua/LuaState;
			 /* monitor-enter v1 */
			 try { // :try_start_0
				 v0 = 				 (( com.naef.jnlua.util.AbstractTableList ) p0 ).size ( ); // invoke-virtual {p0}, Lcom/naef/jnlua/util/AbstractTableList;->size()I
				 /* if-ltz p1, :cond_0 */
				 /* if-lt p1, v0, :cond_1 */
			 } // :cond_0
			 /* new-instance v2, Ljava/lang/IndexOutOfBoundsException; */
			 /* new-instance v3, Ljava/lang/StringBuilder; */
			 /* invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V */
			 final String v4 = "index: "; // const-string v4, "index: "
			 (( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 (( java.lang.StringBuilder ) v3 ).append ( p1 ); // invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
			 final String v4 = ", size: "; // const-string v4, ", size: "
			 (( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 (( java.lang.StringBuilder ) v3 ).append ( v0 ); // invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
			 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
			 /* invoke-direct {v2, v0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V */
			 /* throw v2 */
			 /* :catchall_0 */
			 /* move-exception v0 */
			 /* monitor-exit v1 */
			 /* :try_end_0 */
			 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
			 /* throw v0 */
		 } // :cond_1
		 try { // :try_start_1
			 (( com.naef.jnlua.util.AbstractTableList ) p0 ).get ( p1 ); // invoke-virtual {p0, p1}, Lcom/naef/jnlua/util/AbstractTableList;->get(I)Ljava/lang/Object;
			 (( com.naef.jnlua.util.AbstractTableList ) p0 ).pushValue ( ); // invoke-virtual {p0}, Lcom/naef/jnlua/util/AbstractTableList;->pushValue()V
			 int v3 = -1; // const/4 v3, -0x1
			 /* add-int/lit8 v4, p1, 0x2 */
			 /* add-int/lit8 v5, p1, 0x1 */
			 /* sub-int v6, v0, p1 */
			 /* add-int/lit8 v6, v6, -0x1 */
			 (( com.naef.jnlua.LuaState ) v1 ).tableMove ( v3, v4, v5, v6 ); // invoke-virtual {v1, v3, v4, v5, v6}, Lcom/naef/jnlua/LuaState;->tableMove(IIII)V
			 (( com.naef.jnlua.LuaState ) v1 ).pushNil ( ); // invoke-virtual {v1}, Lcom/naef/jnlua/LuaState;->pushNil()V
			 int v3 = -2; // const/4 v3, -0x2
			 (( com.naef.jnlua.LuaState ) v1 ).rawSet ( v3, v0 ); // invoke-virtual {v1, v3, v0}, Lcom/naef/jnlua/LuaState;->rawSet(II)V
			 int v0 = 1; // const/4 v0, 0x1
			 (( com.naef.jnlua.LuaState ) v1 ).pop ( v0 ); // invoke-virtual {v1, v0}, Lcom/naef/jnlua/LuaState;->pop(I)V
			 /* monitor-exit v1 */
			 /* :try_end_1 */
			 /* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
		 } // .end method
		 public java.lang.Object set ( Integer p0, java.lang.Object p1 ) {
			 /* .locals 5 */
			 (( com.naef.jnlua.util.AbstractTableList ) p0 ).getLuaState ( ); // invoke-virtual {p0}, Lcom/naef/jnlua/util/AbstractTableList;->getLuaState()Lcom/naef/jnlua/LuaState;
			 /* monitor-enter v1 */
			 try { // :try_start_0
				 v0 = 				 (( com.naef.jnlua.util.AbstractTableList ) p0 ).size ( ); // invoke-virtual {p0}, Lcom/naef/jnlua/util/AbstractTableList;->size()I
				 /* if-ltz p1, :cond_0 */
				 /* if-lt p1, v0, :cond_1 */
			 } // :cond_0
			 /* new-instance v2, Ljava/lang/IndexOutOfBoundsException; */
			 /* new-instance v3, Ljava/lang/StringBuilder; */
			 /* invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V */
			 final String v4 = "index: "; // const-string v4, "index: "
			 (( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 (( java.lang.StringBuilder ) v3 ).append ( p1 ); // invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
			 final String v4 = ", size: "; // const-string v4, ", size: "
			 (( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 (( java.lang.StringBuilder ) v3 ).append ( v0 ); // invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
			 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
			 /* invoke-direct {v2, v0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V */
			 /* throw v2 */
			 /* :catchall_0 */
			 /* move-exception v0 */
			 /* monitor-exit v1 */
			 /* :try_end_0 */
			 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
			 /* throw v0 */
		 } // :cond_1
		 try { // :try_start_1
			 (( com.naef.jnlua.util.AbstractTableList ) p0 ).get ( p1 ); // invoke-virtual {p0, p1}, Lcom/naef/jnlua/util/AbstractTableList;->get(I)Ljava/lang/Object;
			 (( com.naef.jnlua.util.AbstractTableList ) p0 ).pushValue ( ); // invoke-virtual {p0}, Lcom/naef/jnlua/util/AbstractTableList;->pushValue()V
			 (( com.naef.jnlua.LuaState ) v1 ).pushJavaObject ( p2 ); // invoke-virtual {v1, p2}, Lcom/naef/jnlua/LuaState;->pushJavaObject(Ljava/lang/Object;)V
			 int v2 = -2; // const/4 v2, -0x2
			 /* add-int/lit8 v3, p1, 0x1 */
			 (( com.naef.jnlua.LuaState ) v1 ).rawSet ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Lcom/naef/jnlua/LuaState;->rawSet(II)V
			 int v2 = 1; // const/4 v2, 0x1
			 (( com.naef.jnlua.LuaState ) v1 ).pop ( v2 ); // invoke-virtual {v1, v2}, Lcom/naef/jnlua/LuaState;->pop(I)V
			 /* monitor-exit v1 */
			 /* :try_end_1 */
			 /* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
		 } // .end method
		 public Integer size ( ) {
			 /* .locals 3 */
			 (( com.naef.jnlua.util.AbstractTableList ) p0 ).getLuaState ( ); // invoke-virtual {p0}, Lcom/naef/jnlua/util/AbstractTableList;->getLuaState()Lcom/naef/jnlua/LuaState;
			 /* monitor-enter v1 */
			 try { // :try_start_0
				 (( com.naef.jnlua.util.AbstractTableList ) p0 ).pushValue ( ); // invoke-virtual {p0}, Lcom/naef/jnlua/util/AbstractTableList;->pushValue()V
				 /* :try_end_0 */
				 /* .catchall {:try_start_0 ..:try_end_0} :catchall_1 */
				 int v0 = -1; // const/4 v0, -0x1
				 try { // :try_start_1
					 (( com.naef.jnlua.LuaState ) v1 ).length ( v0 ); // invoke-virtual {v1, v0}, Lcom/naef/jnlua/LuaState;->length(I)I
					 /* :try_end_1 */
					 v0 = 					 /* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
					 int v2 = 1; // const/4 v2, 0x1
					 try { // :try_start_2
						 (( com.naef.jnlua.LuaState ) v1 ).pop ( v2 ); // invoke-virtual {v1, v2}, Lcom/naef/jnlua/LuaState;->pop(I)V
						 /* monitor-exit v1 */
						 /* :catchall_0 */
						 /* move-exception v0 */
						 int v2 = 1; // const/4 v2, 0x1
						 (( com.naef.jnlua.LuaState ) v1 ).pop ( v2 ); // invoke-virtual {v1, v2}, Lcom/naef/jnlua/LuaState;->pop(I)V
						 /* throw v0 */
						 /* :catchall_1 */
						 /* move-exception v0 */
						 /* monitor-exit v1 */
						 /* :try_end_2 */
						 /* .catchall {:try_start_2 ..:try_end_2} :catchall_1 */
						 /* throw v0 */
					 } // .end method
