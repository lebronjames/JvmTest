JVM性能调优
一、-XX:-DoEscapeAnalysis -XX:-EliminateAllocations -XX:-UseTLAB -XX:+PrintGC
 关闭逃逸分析，关闭标量替换，关闭线程本地内存，打印GC信息

二、-XX:-DoEscapeAnalysis -XX:-EliminateAllocations -XX:-UseTLAB -XX:+PrintGCDetails
 关闭逃逸分析，关闭标量替换，关闭线程本地内存，打印GC详细信息

三、可以使用Runtime类“大致”计算系统内存情况
Runtime.getRuntime().totalMemory()
Runtime.getRuntime().freeMemory()

四、内存溢出
 -XX:+HeapDumpOnOutOfMemoryError -XX:HeapDumpPath=d:\tmp\jvm.dump -XX:+PrintGCDetails
 -Xms10M -Xmx10M
  内存溢出查看工具VisualVM

五、线程栈大小
-Xss128k 测试：1096
-Xss1280k 测试：39640
