package com.lh.principles.demo3.before;

/**
 * @ClassName Computer
 * @Desc //
 * @Author mi
 * @Date 2021/6/13 12:44
 */
public class Computer {
    private XiJieHardDisk disk;
    private IntelCpu cpu;
    private KingstonMemory memory;

    public XiJieHardDisk getHardDisk() {
        return disk;
    }

    public void setHardDisk(XiJieHardDisk xiJieHardDisk) {
        this.disk = xiJieHardDisk;
    }

    public IntelCpu getCpu() {
        return cpu;
    }

    public void setCpu(IntelCpu intelCpu) {
        this.cpu = intelCpu;
    }

    public KingstonMemory getMemory() {
        return memory;
    }

    public void setMemory(KingstonMemory kingstonMemory) {
        this.memory = kingstonMemory;
    }

    public void run() {
        System.out.println("计算机工作");
        cpu.run();
        memory.save();
        String data = disk.get();
        System.out.println("从硬盘中获取的数据为：" + data);
    }
}
