package com.gmail.mosoft521.ch11.agent.attach;

import com.sun.tools.attach.AgentInitializationException;
import com.sun.tools.attach.AgentLoadException;
import com.sun.tools.attach.AttachNotSupportedException;
import com.sun.tools.attach.VirtualMachine;
import com.sun.tools.attach.VirtualMachineDescriptor;

import java.io.IOException;
import java.util.List;

/**
 * TODO:Add tools.jar
 *
 * @author geym
 */
public class AttachToolMain {
    public static void main(String[] args) throws AttachNotSupportedException, IOException, AgentLoadException, AgentInitializationException {
        List<VirtualMachineDescriptor> list = VirtualMachine.list();
        for (VirtualMachineDescriptor vmd : list) {
            if (vmd.displayName().endsWith("RunLoopAccountMain")) {
                VirtualMachine virtualmachine = VirtualMachine.attach(vmd.id());
                virtualmachine.loadAgent("D:\\ja.jar", "argument for agent");
                System.out.println("ok");
                virtualmachine.detach();
            }
        }
    }
}